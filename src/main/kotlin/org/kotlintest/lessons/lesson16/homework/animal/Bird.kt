package org.example.org.kotlintest.lessons.lesson16.homework.animal

import org.example.org.kotlintest.lessons.lesson16.homework.Colors

class Bird: Animal() {

    override fun makeSound(color: String){
        println("${color}Tweet${Colors.RESET}")
    }
}