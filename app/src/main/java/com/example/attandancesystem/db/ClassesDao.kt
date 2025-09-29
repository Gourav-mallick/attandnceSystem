package com.example.attandancesystem.db

import androidx.room.*
import com.example.attandancesystem.data.model.Classes

@Dao
interface ClassesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClass(classes: Classes)

    @Query("SELECT * FROM classes ")
    suspend fun getAllClasses(): List<Classes>

}