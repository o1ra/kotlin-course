package org.example.org.kotlintest.lessons.lesson15.homework.furniture

open class StorageFurniture(
    name: String,
    material: String,
    color: String,
    manufacturer: String,
    price: Double,
    width: Double,
    height: Double,
    depth: Double,
    val needForAssembly: Boolean // необходимость сборки
) : Furniture(name, material, color, manufacturer, price, width, height, depth) {

}