package org.example.org.kotlintest.lessons.lesson31.homework

class PhoneNumberFormatter {
    fun formatPhoneNumber(phone: String): String {
        // Очищаем строку от нечисловых символов
        val cleanNumber = phone.replace("\\D".toRegex(), "")

        // Проверяем длину
        if (cleanNumber.length != 10 && cleanNumber.length != 11) {
            throw IllegalArgumentException("Невалидный номер телефона")
        }

        // Обрабатываем 11-значные номера
        val normalizedNumber = if (cleanNumber.length == 11) {
            if (cleanNumber[0] !in setOf('7', '8')) {
                throw IllegalArgumentException("Невалидный номер телефона")
            }
            cleanNumber.substring(1) // Удаляем 7 или 8
        } else {
            cleanNumber
        }

        // Проверяем, что после нормализации ровно 10 цифр
        if (normalizedNumber.length != 10) {
            throw IllegalArgumentException("Невалидный номер телефона")
        }

        // Форматируем в нужный вид
        val formatted = "+7 (${normalizedNumber.substring(0, 3)}) ${normalizedNumber.substring(3, 6)}-${normalizedNumber.substring(6, 8)}-${normalizedNumber.substring(8)}"
        return formatted
    }
}