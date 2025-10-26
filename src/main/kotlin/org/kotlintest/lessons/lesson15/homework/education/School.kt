package org.example.org.kotlintest.lessons.lesson15.homework.education

open class School(
    name: String,
    type: String,
    numberOfStudents: Int,
    numberOfTeachers: Int,
    rating: Double,
    val classes: List<String>,
    val subject:  List<String>,
    val yearsOfEdication: Int

) : EducationalInstitution(name, type, numberOfStudents, numberOfTeachers, rating) {
}