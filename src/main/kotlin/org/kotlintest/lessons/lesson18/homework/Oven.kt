package org.example.org.kotlintest.lessons.lesson18.homework

class Oven(override var isPoweredOn: Boolean) : SetTemperature() {
    override val maxTemperature: Int = 250

    override fun setTemperature(temp: Int) {
        if (isPoweredOn) {
            if (temp <= maxTemperature) {
                println("Установка температуры духовки: $temp градусов")
            } else {
                println("Ошибка: температура превышает максимум $maxTemperature")
            }
        } else {
            println("Невозможно установить температуру, питание выключено")
        }
    }

    override fun open() {
        println("Открытие крышки духовки")
    }

    override fun close() {
        println("Закрытие крышки духовки")
    }

}
