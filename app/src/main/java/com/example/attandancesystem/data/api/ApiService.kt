package com.example.attandancesystem.data.api

import com.example.attandancesystem.data.model.Institute

import retrofit2.Response

import retrofit2.http.GET


interface ApiService {

    @GET("institutes")
    suspend fun getInstitutes(): Response<List<Institute>>

    // Later you add:
    // @GET("students")
    // suspend fun getStudents(): Response<List<Student>>
}