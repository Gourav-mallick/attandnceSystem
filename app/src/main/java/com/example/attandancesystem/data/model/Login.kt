package com.example.attandancesystem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "login")
data class Login(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val instId: String,
    val password: String,
    val userType: String,
    val username: String
)