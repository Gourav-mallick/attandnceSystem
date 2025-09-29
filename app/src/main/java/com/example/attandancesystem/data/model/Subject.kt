package com.example.attandancesystem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subjects")
data class Subject(
    @PrimaryKey
    val subId: String,
    val instId: String,
    val isElective: Int,
    val subCode: String,

    val subName: String,
    val subShortName: String
)