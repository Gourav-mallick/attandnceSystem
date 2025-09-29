//check local database setup or not

package com.example.attandancesystem.utils

import android.util.Log
import com.example.attandancesystem.data.model.Institute
import com.example.attandancesystem.data.model.Student
import com.example.attandancesystem.db.InstitutesDao
import com.example.attandancesystem.db.StudentsDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object DatabaseLogger {

    fun logInstitutes(dao: InstitutesDao) {
        CoroutineScope(Dispatchers.IO).launch {
            val institutes: List<Institute> = dao.getAllInstitutes()
            if (institutes.isEmpty()) {
                Log.d("RoomData", "No institutes found in database.")
            } else {
                for (inst in institutes) {
                    Log.d(
                        "RoomData",
                        "ID: ${inst.instId}, Name: ${inst.instName}, Address: ${inst.address}, Academic Year: ${inst.academicYear}, University ID: ${inst.universityId}"
                    )
                }
            }
        }
    }

    fun logStudents(dao: StudentsDao) {
        CoroutineScope(Dispatchers.IO).launch {
            val students: List<Student> = dao.getAllStudents()
            if (students.isEmpty()) {
                Log.d("RoomData", "No students found in database.")
            } else {
                for (student in students) {
                    Log.d(
                        "RoomData",
                        "ID: ${student.stuId}, Name: ${student.stuName}, Roll No: ${student.rollNo}"
                    )
                }
            }
        }
    }
}
