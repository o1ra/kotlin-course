package org.example.org.kotlintest.lessons.lesson18.homework.abstractClass

import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.AutomaticShutdown
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Drainable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Openable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Powerable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Programmable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.TemperatureRegulatable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.WaterContainer

abstract class CoffeeMachine : Powerable, Openable, WaterContainer, TemperatureRegulatable, AutomaticShutdown,
    Drainable, Programmable {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun open() {}
    override fun close() {}
    override val capacity: Int
        get() {
            TODO()
        }

    override fun fillWater(amount: Int) {}
    override fun getWater(amount: Int) {}
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
    override fun programAction(action: String) {}
    override fun execute() {}
}