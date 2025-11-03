package org.example.org.kotlintest.lessons.lesson16.homework


import org.example.org.kotlintest.lessons.lesson16.homework.animal.Animal
import org.example.org.kotlintest.lessons.lesson16.homework.animal.Bird
import org.example.org.kotlintest.lessons.lesson16.homework.animal.Cat
import org.example.org.kotlintest.lessons.lesson16.homework.animal.Dog
import org.example.org.kotlintest.lessons.lesson16.homework.figure.Circle
import org.example.org.kotlintest.lessons.lesson16.homework.figure.Shape
import org.example.org.kotlintest.lessons.lesson16.homework.figure.Square
import org.example.org.kotlintest.lessons.lesson16.homework.figure.Triangle
import org.example.org.kotlintest.lessons.lesson16.homework.printer.InkjetPrinter
import org.example.org.kotlintest.lessons.lesson16.homework.printer.LaserPrinter

fun main() {
    val listAnimal: List<Animal> = listOf(
        Bird(),
        Cat(),
        Dog()
    )


    listAnimal.forEach { it.makeSound(Colors.YELLOW) }


    val listShape: List<Shape> = listOf(
        Circle(3.15),
        Square(6.9),
        Triangle(4.7, 2)
    )

    listShape.forEach {
        println(
            "Площадь фигуры = ${
                it.area()
            }"
        )
    }


    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()


    val longText = "Это длинный текст для проверки работы цветного струйного принтера с разноцветными словами"

    println("Лазерный принтер:")
    laserPrinter.print(longText)

    println("\nСтруйный принтер:")
    inkjetPrinter.print(longText)


}




