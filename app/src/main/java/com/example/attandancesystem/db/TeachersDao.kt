package com.example.attandancesystem.db

import androidx.room.*
import com.example.attandancesystem.data.model.Teacher

@Dao
interface TeachersDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTeacher(teacher: Teacher)

    @Query("SELECT * FROM teachers ")
    suspend fun getAllTeachers(): List<Teacher>
}