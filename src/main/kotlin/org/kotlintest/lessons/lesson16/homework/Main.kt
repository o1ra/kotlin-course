package org.example.org.kotlintest.lessons.lesson16.homework

import org.example.org.kotlintest.lessons.lesson16.homework.animal.*

fun main() {
    val listAnimal: List<Animal> = listOf(
        Bird(),
        Cat(),
        Dog()
    )


    listAnimal.forEach { it.makeSound(Colors.GREEN) }



}