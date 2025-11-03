package org.example.org.kotlintest.lessons.lesson16.homework.printer

import org.example.org.kotlintest.lessons.lesson16.homework.Background
import org.example.org.kotlintest.lessons.lesson16.homework.Colors

class InkjetPrinter() : Printer() {
    private val colorPairs = listOf(
        Pair(Colors.RED, Background.YELLOW),
        Pair(Colors.GREEN, Background.BLUE),
        Pair(Colors.YELLOW, Background.PURPLE),
        Pair(Colors.BLUE, Background.CYAN),
        Pair(Colors.PURPLE, Background.GREEN),
        Pair(Colors.CYAN, Background.RED),
        Pair(Colors.WHITE, Background.BLACK)
    )

    override fun print(text: String) {
        val words = text.split(" ")
        for ((index, word) in words.withIndex()) {
            val (textColor, bgColor) = colorPairs[index % colorPairs.size]
            println("$textColor$bgColor$word${Colors.RESET}${Background.RESET} ")
        }
        println()
    }
}
