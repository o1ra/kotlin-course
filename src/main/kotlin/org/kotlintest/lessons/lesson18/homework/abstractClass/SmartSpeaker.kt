package org.example.org.kotlintest.lessons.lesson18.homework.abstractClass

import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Powerable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.Programmable
import org.example.org.kotlintest.lessons.lesson18.homework.allInterface.SoundEmitting
import java.io.InputStream

abstract class SmartSpeaker : Powerable, SoundEmitting, Programmable {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun setVolume(volume: Int) {}
    override fun mute() {}
    override fun playSound(stream: InputStream) {}
    override fun programAction(action: String){}
    override fun execute(){}
}