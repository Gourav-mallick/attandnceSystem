package com.example.attandancesystem.db

import androidx.room.*
import com.example.attandancesystem.data.model.Session

@Dao
interface SessionsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSession(session: Session)

    @Query("SELECT * FROM sessions ")
    suspend fun getAllSessions(): List<Session>

}