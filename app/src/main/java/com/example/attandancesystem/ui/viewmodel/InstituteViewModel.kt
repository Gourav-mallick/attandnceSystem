package com.example.attandancesystem.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.attandancesystem.data.model.Institute
import com.example.attandancesystem.data.repository.InstituteRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class InstituteViewModel(private val repo: InstituteRepository) : ViewModel() {
    private val _institutes = MutableStateFlow<List<Institute>>(emptyList())
    val institutes: StateFlow<List<Institute>> = _institutes

    fun loadInstitutes() {
        viewModelScope.launch {
            try {
                repo.fetchAndSaveInstitutes() // Fetch from API and save to DB
                _institutes.value = repo.getLocalInstitutes() // Load from DB
            } catch (e: Exception) {
                // Handle errors (e.g., log or show UI message)
                Log.e("InstituteViewModel", "Error loading institutes: ${e.message}")
            }
        }
    }
}