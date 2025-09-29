package com.example.attandancesystem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "classes")
data class Classes(
    @PrimaryKey
    val classId: String,
    val className: String,
    val instId: String
)