package org.example.org.kotlintest.lessons.lesson18.homework

import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.AutomaticShutdown
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Drainable

class Refrigerator : SetTemperature(), AutomaticShutdown, Drainable {
    override val maxTemperature: Int
        get() = 100

    override var sensorType: String = "Температурный"
    override var maxSensoredValue: Int = 10


    override fun startMonitoring() {
        println("Начало мониторинга сенсора типа $sensorType с максимальным значением $maxSensoredValue")
    }

    override fun connectToDrain() {
        println("Подключение к сливу")
    }

    override fun drain() {
        println("Слив воды")
    }
}

