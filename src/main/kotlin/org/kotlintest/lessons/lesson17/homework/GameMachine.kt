package org.example.org.kotlintest.lessons.lesson17.homework

class GameMachine(
    val color: String,                    // Цвет автомата — постоянное свойство
    val model: String,                    // Модель автомата — постоянное свойство
    val owner: String,                    // Владелец автомата — постоянное свойство
    val supportPhone: String,             // Телефон поддержки — постоянное свойство
    private val pinCode: String,          // Пин-код для доступа к сейфу (приватно)
    val sessionPrice: Int                 // Стоимость одного игрового сеанса (постоянное)
) {
    var isPoweredOn: Boolean = false      // Признак, включен ли автомат
        private set
    var isOSLoaded: Boolean = false       // Признак, загружена ли ОС
        private set
    var hasJoystick: Boolean = false      // Наличие джойстика (может меняться)
    var collectedBalance: Int = 0         // Баланс собранных средств
        private set
    var isSessionPaid: Boolean = false    // Оплачен ли игровой сеанс
        private set

    private val gameList: MutableList<String> = mutableListOf() // Список игр


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