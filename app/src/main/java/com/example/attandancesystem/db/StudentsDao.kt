package com.example.attandancesystem.db

import androidx.room.*
import com.example.attandancesystem.data.model.Student

@Dao
interface StudentsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: List<Student>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllStudents(students: List<Student>)

    @Query("SELECT * FROM students ")
    suspend fun getAllStudents(): List<Student>
}