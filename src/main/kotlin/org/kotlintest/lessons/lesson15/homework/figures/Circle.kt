package org.example.org.kotlintest.lessons.lesson15.homework.figures

import org.example.org.kotlintest.lessons.lesson15.homework.figures.GeometricFigure
import kotlin.math.pow

class Circle(
    name: String,
    color: String,
    x: Double,
    y: Double,
    val radius: Double
) : GeometricFigure(name, color, x, y) {
     override fun area() {
         println("Площадь круга = ${Math.PI*radius.pow(2)}")

    }

    override fun perimeter() {
        println("Периметр круга = ${2* Math.PI*radius}")

    }


}