package org.example.org.kotlintest.lessons.lesson18.homework.abstractClass

import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.AutomaticShutdown
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Drainable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Openable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Powerable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.TemperatureRegulatable

abstract class Refrigerator : Powerable, Openable, TemperatureRegulatable, AutomaticShutdown, Drainable {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun open() {}
    override fun close() {}
    override val maxTemperature: Int
        get() {
            TODO()
        }

    override fun setTemperature(temp: Int) {}
    override val sensorType: String
        get() {
            TODO()
        }
    override val maxSensoredValue: Int
        get() {
            TODO()
        }

    override fun startMonitoring() {}
    override fun connectToDrain() {}
    override fun drain() {}
}