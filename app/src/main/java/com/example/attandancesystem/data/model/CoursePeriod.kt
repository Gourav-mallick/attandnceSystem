package com.example.attandancesystem.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "course_periods")
data class CoursePeriod(
    @PrimaryKey
    val courseId: String,
    val divId: String,
    val periodId: String,
    val teacherId: String
)