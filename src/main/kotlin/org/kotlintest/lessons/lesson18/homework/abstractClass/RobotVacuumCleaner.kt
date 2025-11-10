package org.example.org.kotlintest.lessons.lesson18.homework.abstractClass

import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.AutomaticShutdown
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Cleanable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Movable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Powerable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Rechargeable

abstract class RobotVacuumCleaner : Powerable, Movable, AutomaticShutdown, Rechargeable, Cleanable {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun move(direction: String, distance: Int) {}
    override val sensorType: String
        get() {
            TODO()
        }
    override val maxSensoredValue: Int
        get() {
            TODO()
        }

    override fun startMonitoring() {}
    override fun getChargeLevel(): Double {
        return TODO("Provide the return value")
    }
    override fun recharge() {}
    override fun clean() {}
}