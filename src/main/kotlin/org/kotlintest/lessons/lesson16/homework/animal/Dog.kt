package org.example.org.kotlintest.lessons.lesson16.homework.animal

import org.example.org.kotlintest.lessons.lesson16.homework.Colors

class Dog: Animal() {

    override fun makeSound(color: String) {
        println("${color}Bark${Colors.RESET}")
    }
}