package org.example.org.kotlintest.lessons.lesson14

class Lamp(var shine: Boolean){

    fun turnOn() {
        shine = true

    }

    fun turnOff() {
        shine = false
    }

    fun toggle(){
        shine = !shine
        if(shine) {
            println("Включено")
        } else {
            println("Выключено")
        }

    }

}