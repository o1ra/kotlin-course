package org.example.org.kotlintest.lessons.lesson16.homework.logger

import org.example.org.kotlintest.lessons.lesson16.homework.Background
import org.example.org.kotlintest.lessons.lesson16.homework.Colors

class Logger {

    fun log(message: String) {
        println("[INFO] $message")
    }

    // Перегрузка: принять уровень и сообщение
    fun log(level: String, message: String) {
        when (level) {
            "WARNING" -> println("${Colors.YELLOW}[WARNING] $message${Colors.RESET}")
            "ERROR" -> println("${Colors.RED}${Background.WHITE}[ERROR] $message${Colors.RESET}${Background.RESET}")
            else -> println("[INFO] $message")
        }
    }

    // Перегрузка: список сообщений с уровнем INFO
    fun log(messages: List<String>) {
        for (msg in messages) {
            log("INFO", msg)
        }
    }

    fun log(exception: Exception) {
        log("ERROR", exception.message ?: "Unknown error")
    }
}

