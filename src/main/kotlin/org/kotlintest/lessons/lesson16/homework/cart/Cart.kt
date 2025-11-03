package org.example.org.kotlintest.lessons.lesson16.homework.cart

class Cart {
    private val items = mutableMapOf<Int, Int>()

    // Добавить 1 единицу товара по itemId
    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    // Перегрузка: добавить amount единиц товара по itemId
    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    // Перегрузка: добавить товары из словаря id -> количество
    fun addToCart(newItems: Map<Int, Int>) {
        for ((id, amount) in newItems) {
            items[id] = items.getOrDefault(id, 0) + amount
        }
    }

    // Перегрузка: добавить товары из списка id, по 1 единице каждого
    fun addToCart(ids: List<Int>) {
        for (id in ids) {
            items[id] = items.getOrDefault(id, 0) + 1
        }
    }

    override fun toString(): String {
        val totalUniqueItems = items.size
        val totalItemCount = items.values.sum()
        val sb = StringBuilder()
        sb.append("Корзина товаров:\n")
        sb.append(String.format("%-10s | %-10s\n", "ID товара", "Количество"))
        sb.append("-".repeat(25)).append("\n")
        for ((id, count) in items) {
            sb.append(String.format("%-10d | %-10d\n", id, count))
        }
        sb.append("-".repeat(25)).append("\n")
        sb.append("Всего уникальных артикулов: $totalUniqueItems\n")
        sb.append("Общее количество товаров: $totalItemCount\n")
        return sb.toString()
    }
}