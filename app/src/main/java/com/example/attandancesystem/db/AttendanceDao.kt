package com.example.attandancesystem.db

import androidx.room.*
import com.example.attandancesystem.data.model.Attendance

@Dao
interface AttendanceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAttendance(attendance: Attendance): Long


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(attendanceList: List<Attendance>): List<Long>

    @Query("SELECT * FROM attendance WHERE sessionId = :sessionId")
    suspend fun getAttendanceBySessionId(sessionId: String): List<Attendance>

}