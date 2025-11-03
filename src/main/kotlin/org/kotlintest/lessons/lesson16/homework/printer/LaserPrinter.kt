package org.example.org.kotlintest.lessons.lesson16.homework.printer
import org.example.org.kotlintest.lessons.lesson16.homework.Background
import org.example.org.kotlintest.lessons.lesson16.homework.Colors

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            // Черный текст на белом фоне
            println("${Colors.BLACK}${Background.WHITE}$word${Colors.RESET}${Background.RESET}")
        }
    }
}
