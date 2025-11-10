package org.example.org.kotlintest.lessons.lesson18.homework.abstractClass

import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.BatteryOperated
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.LightEmitting
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Powerable

abstract class Flashlight : Powerable, BatteryOperated, LightEmitting {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun getCapacity(): Double {
        return TODO("Provide the return value")
    }
    override fun replaceBattery() {}
    override fun emitLight() {}
    override fun completeLiteEmission() {}
}