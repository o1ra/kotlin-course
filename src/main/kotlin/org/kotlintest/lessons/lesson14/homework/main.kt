package org.example.org.kotlintest.lessons.lesson14.homework

fun main() {
    val party = Party("Test", 210)
    party.details()

    val emotion = Emotion("happiness", 8)
    emotion.express()

    Moon.showPhase()

    val ananas = Product("Ananas", 10.0, 15)
    println(ananas)

    val concert = Concert("The Beatles", "Madison Square Garden", 5000, 1000)
    concert.printDetails()
    concert.buyTicket()
    concert.printDetails()

}