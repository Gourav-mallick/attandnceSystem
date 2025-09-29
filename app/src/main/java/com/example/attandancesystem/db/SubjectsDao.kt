package com.example.attandancesystem.db

import androidx.room.*
import com.example.attandancesystem.data.model.Subject

@Dao
interface SubjectsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: Subject)

    @Query("SELECT * FROM subjects ")
    suspend fun getAllSubjects(): List<Subject>
}