package com.example.attandancesystem.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

import com.example.attandancesystem.data.model.Attendance
import com.example.attandancesystem.data.model.Classes
import com.example.attandancesystem.data.model.Course
import com.example.attandancesystem.data.model.CoursePeriod
import com.example.attandancesystem.data.model.Login
import com.example.attandancesystem.data.model.Division
import com.example.attandancesystem.data.model.Institute
import com.example.attandancesystem.data.model.Session
import com.example.attandancesystem.data.model.Student
import com.example.attandancesystem.data.model.Subject
import com.example.attandancesystem.data.model.SubjectHead
import com.example.attandancesystem.data.model.Teacher

@Database(entities = [
    Attendance::class,
    Classes::class,
    Course::class,
    CoursePeriod::class,
   Division::class,
    Institute::class,
    Login::class,
    Session::class,
    Student::class,
    Subject::class,
    SubjectHead::class,
    Teacher::class

],
    version = 1, exportSchema = false
)

//Dao
   abstract class AppDatabase : RoomDatabase() {

    abstract fun attendanceDao(): AttendanceDao
    abstract fun classesDao(): ClassesDao
    abstract fun coursesDao(): CoursesDao
    abstract fun coursePeriodsDao(): CoursePeriodsDao
    abstract fun divisionDao(): DivisionDao
    abstract fun institutesDao(): InstitutesDao
    abstract fun sessionsDao(): SessionsDao
    abstract fun studentsDao(): StudentsDao
    abstract fun subjectsDao(): SubjectsDao
    abstract fun subjectHeadsDao(): SubjectHeadsDao
    abstract fun teachersDao(): TeachersDao
    abstract fun loginDao(): LoginDao


    // Companion object for singleton instance
    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }

        }
    }
}

