package com.example.attandancesystem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subject_heads")
data class SubjectHead(
    @PrimaryKey
    val headId: String,
    val type: String
)