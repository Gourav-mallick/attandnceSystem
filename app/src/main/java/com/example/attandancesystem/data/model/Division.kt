package com.example.attandancesystem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "divisions")
data class Division(
    @PrimaryKey
    val divId: String,
    val classId: String,
    val divName: String
)