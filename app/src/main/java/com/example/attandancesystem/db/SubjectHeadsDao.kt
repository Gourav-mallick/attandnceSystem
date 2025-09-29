package com.example.attandancesystem.db

import androidx.room.*
import com.example.attandancesystem.data.model.SubjectHead

@Dao
interface SubjectHeadsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubjectHead(subjectHead: SubjectHead)

    @Query("SELECT * FROM subject_heads ")
    suspend fun getAllSubjectHeads(): List<SubjectHead>

}