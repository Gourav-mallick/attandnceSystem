package com.example.attandancesystem.data.model



data class ApiResponse(

    val attendance: List<Attendance>,
    val classes: List<Classes>,
    val coursePeriods: List<CoursePeriod>,
    val courses: List<Course>,
    val division: List<Division>,
    val institutes: List<Institute>,
    val login: List<Login>,
    val sessions: List<Session>,
    val students: List<Student>,
    val subjectHeads: List<SubjectHead>,
    val subjects: List<Subject>,
    val teachers: List<Teacher>
)