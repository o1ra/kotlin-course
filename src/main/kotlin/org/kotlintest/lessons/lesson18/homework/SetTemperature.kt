package org.example.org.kotlintest.lessons.lesson18.homework

import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Openable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.TemperatureRegulatable

//Задача 4. Создай абстрактный класс оборудования с возможностью устанавливать температуру
// и открываться и с наследованием от программируемого оборудования.
// Также имплементируй интерфейсы.

abstract class SetTemperature : ProgrammableEquipment(), TemperatureRegulatable, Openable {
    override val maxTemperature: Int = 100


    override fun setTemperature(temp: Int) {
        println("Установка температуры: $temp градусов")
    }

    override fun open() {
        println("Открытие оборудования")
    }

    override fun close() {
        println("Закрытие оборудования")
    }
}
