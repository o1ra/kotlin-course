package org.example.org.kotlintest.lessons.lesson17.homework

abstract class BaseClass(
    // 1. privateVal доступно в main() через ChildrenClass, т.к. у ChildrenClass есть публичное свойство с таким именем
    // в конструкторе и оно проксирует доступ к private полю родителя
    private val privateVal: String,

    // 2. protectedVal недоступно в main(), т.к. protected доступен только в наследниках и внутри пакета
    protected val protectedVal: String,

    val publicVal: String  // publicVal доступно везде
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    // 5. protectedField можно изменить в наследнике через setter
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"

    // 6. добавляем setter для privateField для изменения из main()
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"
    fun setPrivateField(value: String) { privateField = value }

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // 7. getProtectedClass() не может быть публичной, чтобы не раскрывать ProtectedClass всем пользователям класса
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    // 8. Причина, почему в поле "generate" другой текст, потому что generate() переопределена в наследнике
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    // 9. getPrivateClass() не может быть публичной или protected, т.к. возвращает приватный класс,
    // и хотим ограничить его использование только внутри BaseClass
    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}


class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. publicVal — аргумент конструктора, доступен в main(), т.к. он публичный и передается базовому классу
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    // 11. getAll() доступна в main(), т.к. унаследована от BaseClass, где она публичная

    // 12. при вызове printText() печатается "Печать из класса BaseClass",
    // а privatePrint() из ChildrenClass не вызывается, т.к. private методы не виртуальны и не переопределяются

    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }

    // 5. Для изменения protectedField из main() через сеттер в наследнике, добавляем публичный сеттер
    fun setProtectedField(value: String) {
        protectedField = value
    }
}

fun main() {
    val child = ChildrenClass("приват", "защищено", "публично")

    // 1. privateVal доступен через публичное свойство в ChildrenClass
    println(child.privateVal)

    // 2. protectedVal не доступно напрямую:
    // println(child.protectedVal) // Ошибка

    // 3. изменим publicField из main()
    child.publicField = "Антонио Бандерас"

    // 5. изменим protectedField через сеттер наследника
    child.setProtectedField("Новое значение защищенного поля")

    // 6. изменим privateField через публичный сеттер базового класса
    child.setPrivateField("Измененный privateField")

    // 11. вызов getAll()
    println(child.getAll())

    // 12. вызов printText()
    child.printText()
}
