package org.example.org.kotlintest.lessons.lesson16.homework.logger

import org.example.org.kotlintest.lessons.lesson16.homework.Colors

class Logger {

    fun log(message: String) {
        println("[INFO] $message")
    }

    // Перегрузка: принять уровень и сообщение
    fun log(level: String, message: String) {
        when (level) {
            "INFO" -> println("[INFO] $message")
            "WARNING" -> println("${Colors.BLUE}[WARNING] $message${Colors.RESET}")
            "ERROR" -> println("${Colors.RED}[ERROR] $message${Colors.RESET}")
            "DEBUG" -> println("${Colors.GREEN}[DEBUG] $message${Colors.RESET}")
            else -> println("[INFO] $message")
        }
    }





}