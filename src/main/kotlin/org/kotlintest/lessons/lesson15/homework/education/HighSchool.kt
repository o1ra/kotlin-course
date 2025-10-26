package org.example.org.kotlintest.lessons.lesson15.homework.education

class HighSchool(
    name: String,
    type: String,
    numberOfStudents: Int,
    numberOfTeachers: Int,
    rating: Double,
    classes: List<String>,
    subject:  List<String>,
): School(name, type, numberOfStudents, numberOfTeachers, rating, classes, subject, 7){

}

