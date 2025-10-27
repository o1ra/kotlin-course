package org.example.org.kotlintest.lessons.lesson14.homework

class Concert(val band: String, val location: String, val cost: Int, val capacity: Int) {

    private var ticketSold = 0

    fun buyTicket() {
        if (ticketSold < capacity) {
            ticketSold++
            println("Продано билетов: ${ticketSold}")
        }
    }

    fun printDetails() {
        println("Концерт группы $band в $location. Стоимость билета $cost. Уже продано $ticketSold билетов из $capacity.")
    }
}