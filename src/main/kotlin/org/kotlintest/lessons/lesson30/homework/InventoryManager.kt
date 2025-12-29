package org.example.org.kotlintest.lessons.lesson30.homework

class InventoryManager(private val capacity: Int) {
    private val items = mutableMapOf<String, Int>()

    /**
     * Метод возвращает количество инвентаря. Если наименования нет, возвращает 0
     */
    fun getItemCount(itemName: String): Int {
        return items[itemName] ?: 0  // Фикс: используем Elvis operator вместо getValue [web:11]
    }

    /**
     * Добавляет инвентарь в хранилище к существующему.
     * @param itemName название инвентаря
     * @param quantity количество инвентаря
     * @throws IllegalStateException в случае, если допустимое количество может быть превышено
     */
    fun addItem(itemName: String, quantity: Int) {
        checkCapacity(quantity)  // Фикс: проверяем ёмкость ПЕРЕД добавлением

        val current = items[itemName] ?: 0
        items[itemName] = current + quantity  // Фикс: добавляем к существующему количеству
    }

    /**
     * Удаляет инвентарь из хранилища
     * @param itemName название инвентаря
     * @param quantity количество инвентаря для удаления
     * @return true если удаление произошло и false если удаление невозможно
     */
    fun removeItem(itemName: String, quantity: Int): Boolean {
        val currentQuantity = items[itemName] ?: 0
        return if (currentQuantity >= quantity) {
            // Фикс: правильная логика - удаляем если хватает количества
            items[itemName] = currentQuantity - quantity
            true
        } else {
            // Не хватает количества или предмета нет
            false
        }
    }

    /**
     * Проверяет, что количество объектов в инвентаре с учётом добавляющихся не превысит допустимого количества
     */
    private fun checkCapacity(itemsForAdding: Int) {
        val currentTotal = items.values.sum()
        check(capacity >= currentTotal + itemsForAdding) {  // Фикс: правильное условие
            "Количество инвентаря (${currentTotal + itemsForAdding}) не должно превышать $capacity единиц"
        }
    }
}

