package com.example.attandancesystem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sessions")
data class Session(
    @PrimaryKey
    val sessionId: String,
    val date: String,
    val endTime: String,
    val instId: String,
    val isMerged: Int,
    val periodId: String,

    val startTime: String
)