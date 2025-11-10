package org.example.org.kotlintest.lessons.lesson17

class Lamp() {

    private var isOn: Boolean = false

    fun turnOn(){
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun shine(): Boolean {
        return isOn
    }
}