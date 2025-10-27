package org.example.org.kotlintest.lessons.lesson14.homework

class Emotion(val type: String, val intensity: Int) {
    fun express() {
        println("Feeling $type with intensity level $intensity.")
    }
}