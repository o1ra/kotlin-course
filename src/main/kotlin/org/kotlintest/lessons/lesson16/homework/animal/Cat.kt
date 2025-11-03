package org.example.org.kotlintest.lessons.lesson16.homework.animal

class Cat: Animal() {

    override fun makeSound(color: String) {
        println("${color}Meow")
    }
}