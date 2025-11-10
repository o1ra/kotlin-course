package org.example.org.kotlintest.lessons.lesson18.homework

import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Powerable

abstract class Power : Powerable {
    abstract var isPoweredOn: Boolean

    override fun powerOn() {
        isPoweredOn = true
        println("Включено")
    }

    override fun powerOff() {
        isPoweredOn = true
        println("Выключено")
    }
}