package org.example.org.kotlintest.lessons.lesson16.homework.animal

import org.example.org.kotlintest.lessons.lesson16.homework.Colors

abstract class Animal {

    open fun makeSound(color: String){
        println("${color}This animal makes no sound.${Colors.RESET}")
    }
}