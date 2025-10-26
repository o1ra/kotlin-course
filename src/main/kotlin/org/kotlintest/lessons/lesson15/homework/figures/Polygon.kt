package org.example.org.kotlintest.lessons.lesson15.homework.figures

open class Polygon(
    name: String,
    color: String,
    x: Double,
    y: Double,
): GeometricFigure(name, color, x, y) {
    override fun area(){
        println("area undefined")
    }

    override fun perimeter(){
        println("perimeter undefined")
    }


}