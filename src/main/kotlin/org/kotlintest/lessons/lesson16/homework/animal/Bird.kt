package org.example.org.kotlintest.lessons.lesson16.homework.animal

class Bird: Animal() {

    override fun makeSound(color: String){
        println("${color}Tweet")
    }
}