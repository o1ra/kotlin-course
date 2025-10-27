package org.example.org.kotlintest.lessons.lesson14.homework

class Party(val location: String, val attendees: Int) {
    fun details() {
        println("Место проведения вечеринки - $location, ожидаемое количество гостей: $attendees")
    }
}