package com.example.attandancesystem.db

import androidx.room.Dao
import androidx.room.Query
import com.example.attandancesystem.data.model.Login

@Dao
interface LoginDao {
    @Query("SELECT * FROM login WHERE username = :username AND password = :password")
    suspend fun login(username: String, password: String): Login?



}