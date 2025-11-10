package org.example.org.kotlintest.lessons.lesson18.homework.abstractClass

import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Powerable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Programmable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Timable

abstract class ElectronicClock : Powerable, Programmable, Timable {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun programAction(action: String) {}
    override fun execute() {}
    override fun setTimer(time: Int) {}
}