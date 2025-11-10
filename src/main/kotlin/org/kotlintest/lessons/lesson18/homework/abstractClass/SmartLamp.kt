package org.example.org.kotlintest.lessons.lesson18.homework.abstractClass

import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.LightEmitting
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Powerable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Programmable

abstract class SmartLamp : Powerable, LightEmitting, Programmable {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun emitLight() {}
    override fun completeLiteEmission() {}
    override fun programAction(action: String) {}
    override fun execute() {}
}