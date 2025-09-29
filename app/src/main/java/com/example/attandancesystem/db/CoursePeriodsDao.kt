package com.example.attandancesystem.db

import androidx.room.*
import com.example.attandancesystem.data.model.CoursePeriod

@Dao
interface CoursePeriodsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCoursePeriod(coursePeriod: CoursePeriod)

    @Query("SELECT * FROM course_periods ")
    suspend fun getAllCoursePeriods(): List<CoursePeriod>
}