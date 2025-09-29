package com.example.attandancesystem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "attendance")
data class Attendance(
    @PrimaryKey
    val atteId: String,
    val deviceId: String,
    val instId: String,
    val markedAt: String,
    val sessionId: String,
    val status: String,
    val stuId: String,
    val syncStatus: String
)