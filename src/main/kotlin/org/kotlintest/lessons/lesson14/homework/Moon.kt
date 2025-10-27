package org.example.org.kotlintest.lessons.lesson14.homework

object Moon {
    val isVisible: Boolean = true
    val phase: String = "Full Moon"
    fun showPhase() {
        if (isVisible) {
            println("Текущая фаза луны: $phase.")
        } else {
            println("Луна не видна, попробуйте позже")
        }
    }
}