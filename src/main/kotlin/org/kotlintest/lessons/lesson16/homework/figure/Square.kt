package org.example.org.kotlintest.lessons.lesson16.homework.figure

class Square(val a: Double) : Shape() {

    override fun area(): Double {
        return a*a
    }
}