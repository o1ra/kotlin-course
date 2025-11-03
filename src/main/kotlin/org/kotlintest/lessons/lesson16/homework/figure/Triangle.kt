package org.example.org.kotlintest.lessons.lesson16.homework.figure

class Triangle(
    val a: Double, //основание, сторона 1
    val h: Int, //Высота, проведенная к основанию
) : Shape() {

    override fun area(): Double {
        return 0.5*a*h
    }
}