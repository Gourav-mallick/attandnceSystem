package com.example.attandancesystem.db

import androidx.room.*
import com.example.attandancesystem.data.model.Institute

@Dao
interface InstitutesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertInstitute(institute: Institute)

    @Query("SELECT * FROM institutes ")
    suspend fun getAllInstitutes(): List<Institute>

}