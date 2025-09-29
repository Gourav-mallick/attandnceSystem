package com.example.attandancesystem.db

import androidx.room.*
import com.example.attandancesystem.data.model.Division

@Dao
interface DivisionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDivision(division: Division)

    @Query("SELECT * FROM divisions ")
    suspend fun getAllDivisions(): List<Division>

}