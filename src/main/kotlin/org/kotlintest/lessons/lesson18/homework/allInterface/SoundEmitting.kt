package org.example.org.kotlintest.lessons.lesson18.homework.allInterface

import java.io.InputStream

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}