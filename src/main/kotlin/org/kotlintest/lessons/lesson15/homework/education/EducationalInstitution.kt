package org.example.org.kotlintest.lessons.lesson15.homework.education

abstract class EducationalInstitution(
    val name: String,
    val type: String,
    val numberOfStudents: Int,
    val numberOfTeachers: Int,
    val rating: Double
) {

    open fun getStudentCount(): Int {
        return numberOfStudents
    }

    open fun printInfo() {
        println("Название: $name")
        println("Рейтинг: $rating")

    }

}