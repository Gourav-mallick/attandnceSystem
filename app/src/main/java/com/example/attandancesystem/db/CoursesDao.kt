package com.example.attandancesystem.db

import androidx.room.*
import com.example.attandancesystem.data.model.Course

@Dao
interface CoursesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCourse(course: Course)

    @Query("SELECT * FROM courses ")
    suspend fun getAllCourses(): List<Course>

}