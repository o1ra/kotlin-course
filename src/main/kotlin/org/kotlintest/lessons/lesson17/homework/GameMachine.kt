package org.example.org.kotlintest.lessons.lesson17.homework

class GameMachine(
    val color: String,
    val model: String,
    val owner: String,
    val supportPhone: String,
    private val pinCode: String,
    val sessionPrice: Int
) {
    private var isPoweredOn: Boolean = false
    private var isOSLoaded: Boolean = false
    var hasJoystick: Boolean = false
    private var collectedBalance: Int = 0

    private var isSessionPaid: Boolean = false    // Оплачен ли игровой сеанс

    private val gameList: MutableList<String> = mutableListOf() // Список игр (приватно)


    fun powerOn() {
        isPoweredOn = true
        println("Автомат включён.")
    }


    fun powerOff() {
        isPoweredOn = false
        isOSLoaded = false
        println("Автомат выключен.")
    }


    fun loadOS() {
        if (isPoweredOn) {
            isOSLoaded = true
            println("ОС загружена.")
        } else {
            println("Ошибка: автомат выключен.")
        }
    }


    fun shutdownOS() {
        isOSLoaded = false
        println("ОС завершила работу.")
    }


    fun showGames(): List<String> {
        return gameList.toList()
    }


    fun startGame(gameName: String) {
        if (isOSLoaded && isSessionPaid && gameList.contains(gameName)) {
            println("Запуск игры: $gameName")
            isSessionPaid = false // После запуска игровая сессия оплачивается заново
        } else {
            println("Ошибка: либо ОС не загружена, либо не оплачен сеанс, либо игры нет в списке.")
        }
    }


    fun addGame(gameName: String) {
        gameList.add(gameName)
    }


    fun payForSession(amount: Int): Boolean {
        if (amount >= sessionPrice) {
            collectedBalance += sessionPrice
            isSessionPaid = true
            println("Игровой сеанс оплачен.")
            return true
        }
        println("Недостаточно средств для оплаты игрового сеанса.")
        return false
    }


    fun withdrawCash(enteredPin: String): Int? {
        return if (enteredPin == pinCode) {
            val cash = collectedBalance
            collectedBalance = 0
            println("Выдано $cash наличными.")
            cash
        } else {
            println("Пин-код неверен. Доступ запрещён.")
            null
        }
    }


    private fun openSafe(): Int {
        val cash = collectedBalance
        collectedBalance = 0
        println("Сейф открыт. Выдано $cash наличными.")
        return cash
    }
}