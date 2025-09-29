package com.example.attandancesystem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")
data class Student(
    @PrimaryKey
    val stuId: String,
    val classId: String,
    val instId: String,
    val rfidTag: String,
    val rollNo: String,

    val stuName: String
)