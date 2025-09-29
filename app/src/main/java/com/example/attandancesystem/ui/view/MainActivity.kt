package com.example.attandancesystem.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.attandancesystem.R
import com.example.attandancesystem.ui.viewmodel.InstituteViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.attandancesystem.data.api.ApiClient
import com.example.attandancesystem.db.AppDatabase
import com.example.attandancesystem.data.api.ApiService
import com.example.attandancesystem.data.repository.InstituteRepository
import kotlinx.coroutines.launch
class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: InstituteViewModel
    private lateinit var adapter: InstituteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recyclerInstitutes)
        recycler.layoutManager = LinearLayoutManager(this)
        adapter = InstituteAdapter(emptyList())
        recycler.adapter = adapter

        // Build Repo & ViewModel
        val db = AppDatabase.getDatabase(this)
        val api = ApiClient.retrofit.create(ApiService::class.java)
        val repo = InstituteRepository(api, db.institutesDao())
        viewModel = InstituteViewModel(repo)

        lifecycleScope.launch {
            viewModel.institutes.collect { list ->
                adapter.updateData(list) // show institutes in RecyclerView
            }
        }

        viewModel.loadInstitutes() // trigger API call + save + load
    }
}
