package org.example.org.kotlintest.lessons.lesson16.homework.figure

import kotlin.math.pow

class Circle(val radius: Double) : Shape() {

    override fun area(): Double {
        return Math.PI * radius.pow(2)
    }


}
