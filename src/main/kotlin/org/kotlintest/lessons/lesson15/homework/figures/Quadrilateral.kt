package org.example.org.kotlintest.lessons.lesson15.homework.figures

import kotlin.math.sin

class Quadrilateral(
    name: String,
    color: String,
    x: Double,
    y: Double,
    val a: Int, //сторона 1
    val b: Int, //сторона 2
    val c: Int, //сторона 3
    val d: Int, //сторона 4
    val d1: Int, //диагональ 1
    val d2: Int, //диагональ 2
    val alpha: Double // угол между диагоналями
) : Polygon(name, color, x, y) {
    override fun area() {
        println("Площадь четырехугольника = ${0.5*d1*d2* sin(alpha)}")
    }

    override fun perimeter() {
        println("Периметр четырехугольника = ${a+b+c+d}")
    }


}