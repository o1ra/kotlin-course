package org.example.org.kotlintest.lessons.lesson15.homework.furniture

class Dresser(
    name: String,
    material: String,
    color: String,
    manufacturer: String,
    price: Double,
    width: Double,
    height: Double,
    depth: Double,
    needForAssembly: Boolean
): StorageFurniture(name, material, color, manufacturer, price, width, height, depth, needForAssembly){
}