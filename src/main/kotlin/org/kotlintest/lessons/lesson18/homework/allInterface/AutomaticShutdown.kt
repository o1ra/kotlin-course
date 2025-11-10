package org.example.org.kotlintest.lessons.lesson18.homework.allInterface

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}