package com.example.attandancesystem.data.repository

import com.example.attandancesystem.data.api.ApiService
import com.example.attandancesystem.data.model.Institute
import com.example.attandancesystem.db.InstitutesDao

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class InstituteRepository(
    private val api: ApiService,
    private val dao: InstitutesDao
) {
    suspend fun fetchAndSaveInstitutes() {
        val response = api.getInstitutes()
        if (response.isSuccessful) {
            response.body()?.let { institutes ->
                withContext(Dispatchers.IO) {
                    for (inst in institutes) {
                        dao.insertInstitute(inst)
                    }
                }
            }
        }
    }

    suspend fun getLocalInstitutes(): List<Institute> {
        return dao.getAllInstitutes()
    }
}