package com.example.attandancesystem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "institutes")
data class Institute(
    @PrimaryKey
    val instId: String,
    val academicYear: String,
    val address: String,

    val instName: String,
    val universityId: String
)