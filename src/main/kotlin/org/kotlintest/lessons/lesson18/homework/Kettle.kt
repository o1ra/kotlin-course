package org.example.org.kotlintest.lessons.lesson18.homework

class Kettle(override var isPoweredOn: Boolean) : SetTemperature() {
    override val maxTemperature: Int = 110
    private var temperature: Int = 20

    override fun setTemperature(temp: Int) {
        if (isPoweredOn) {
            if (temp <= maxTemperature) {
                temperature = temp
                println("Установка температуры чайника: $temp градусов")
            } else {
                println("Ошибка: температура превышает максимум $maxTemperature")
            }
        } else {
            println("Невозможно установить температуру, питание выключено")
        }
    }

    override fun open() {
        println("Открытие крышки чайника")
    }

    override fun close() {
        println("Закрытие крышки чайника")
    }
}