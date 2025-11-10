package org.example.org.kotlintest.lessons.lesson18.homework

import org.example.org.kotlintest.lessons.lesson18.homework.Power
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Programmable

//Задача 3. Создай абстрактный класс для программируемого оборудования
// (с имплементацией соответствующего интерфейса и реализацией методов)
// и наследуй его от абстрактного класса включаемого оборудования.


abstract class ProgrammableEquipment : Power(), Programmable {
    override fun programAction(action: String) {
        println("Программирование действия: $action")
    }

    override fun execute() {
        println("Выполнение запрограммированного действия")
    }
}