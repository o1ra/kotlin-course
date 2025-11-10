package org.example.org.kotlintest.lessons.lesson18.homework

import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.AutomaticShutdown
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Drainable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Timable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.WaterContainer

class WashingMachine : SetTemperature(), WaterContainer, AutomaticShutdown, Drainable, Timable {
    override val capacity: Int = 50
    override val maxTemperature: Int = 100
    override var sensorType: String = "Уровень воды"
    override var maxSensoredValue: Int = 5

    override fun fillWater(amount: Int) {
        println("Наполнение водой: $amount литров")
    }

    override fun getWater(amount: Int) {
        println("Забор воды: $amount литров")
    }

    override fun startMonitoring() {
        println("Начало мониторинга сенсора типа $sensorType с максимальным значением $maxSensoredValue")
    }

    override fun connectToDrain() {
        println("Подключение к сливу")
    }

    override fun drain() {
        println("Слив воды")
    }

    override fun setTimer(time: Int) {
        println("Установка таймера на $time минут")
    }
}