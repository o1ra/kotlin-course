package org.example.org.kotlintest.lessons.lesson15.homework.education

class University(
    name: String,
    type: String,
    numberOfStudents: Int,
    numberOfTeachers: Int,
    rating: Double,
    val faculties: List<String>,
): EducationalInstitution(name, type, numberOfStudents, numberOfTeachers, rating) {

    fun printFaculties() {
        println("Название: $faculties")

    }

}