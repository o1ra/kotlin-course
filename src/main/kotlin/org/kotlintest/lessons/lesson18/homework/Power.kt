package org.example.org.kotlintest.lessons.lesson18.homework

import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Powerable

abstract class Power : Powerable {
    override fun powerOn() {
        println("Включено")
    }

    override fun powerOff() {
        println("Выключено")
    }
}