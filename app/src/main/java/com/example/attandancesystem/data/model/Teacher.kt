package com.example.attandancesystem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "teachers")
data class Teacher(
    @PrimaryKey
    val teacherId: String,
    val instId: String,
    val teacherEmail: String,

    val teacherName: String
)