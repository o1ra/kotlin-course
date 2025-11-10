package org.example.org.kotlintest.lessons.lesson18.homework

fun main() {
    val ref = Refrigerator(true)
    println(ref.maxTemperature)
    println(ref.powerOff())
    println(ref.powerOn())
    println(ref.connectToDrain())
    println(ref.startMonitoring())
    println(ref.drain())
    println(ref.sensorType)
    println(ref.maxSensoredValue)

}