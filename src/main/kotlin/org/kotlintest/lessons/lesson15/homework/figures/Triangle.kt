package org.example.org.kotlintest.lessons.lesson15.homework.figures

class Triangle(
    name: String,
    color: String,
    x: Double,
    y: Double,
    val a: Int, //основание, сторона 1
    val h: Int, //Высота, проведенная к основанию
    val b: Int, // сторона 2
    val c: Int, // сторона 3
) : Polygon(name, color, x, y) {
    override fun area() {
        println("Площадь треугольника= ${0.5*a*h}")
    }

    override fun perimeter() {
        println("Периметр треугольника = ${a+b+c}")
    }

}