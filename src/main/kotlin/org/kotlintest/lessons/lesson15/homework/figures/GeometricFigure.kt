package org.example.org.kotlintest.lessons.lesson15.homework.figures

abstract class GeometricFigure(
    name: String,
    color: String,
    x: Double,
    y: Double
) {
    abstract fun area()

    abstract fun perimeter()
}