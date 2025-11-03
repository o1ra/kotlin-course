package org.example.org.kotlintest.lessons.lesson16.homework.animal

import org.example.org.kotlintest.lessons.lesson16.homework.Colors

class Cat: Animal() {

    override fun makeSound(color: String) {
        println("${color}Meow${Colors.RESET}")
    }
}