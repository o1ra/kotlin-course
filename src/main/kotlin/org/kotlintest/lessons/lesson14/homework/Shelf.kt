package org.example.org.kotlintest.lessons.lesson14.homework

class Shelf(val capacity: Int) {

    private val items = mutableListOf<String>()

    fun addItem(name: String): Boolean {
        if (!canAccommodate(name)) {
            return false
        }
        items.add(name)
        return true
    }

    fun removeItem(name: String): Boolean {
        if (!items.contains(name)) {
            return false
        }
        items.remove(name)
        return true
    }

    fun canAccommodate(name: String): Boolean {
        val currentAccommodation = items.sumOf {
            it.length
        }
        return currentAccommodation + name.length <= capacity
    }

    fun containsItem(name: String) = items.contains(name)

    fun getItems() = items.toList()
}