package org.example.org.kotlintest.lessons.lesson16.homework.animal

class Dog: Animal() {

    override fun makeSound(color: String) {
        println("${color}Bark")
    }
}