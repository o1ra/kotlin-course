package org.example.org.kotlintest.lessons.lesson09.homework

fun main() {


//1. Работа с массивами Array.
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val array1 = arrayOf(1, 2, 3, 4, 5)

//Создайте пустой массив строк размером 10 элементов.
    val array2 = Array(10) { "" }

//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val array3 = DoubleArray(5) { i -> i.toDouble() * 2 }
    println("array3 = ${array3.contentToString()} ")

//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val array4 = Array(5) { 0 }
    for (i in array4.indices) {
        array4[i] = i * 3
    }
    println("array4 = ${array4.contentToString()} ")

//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val array5 = arrayOfNulls<String>(3)
    array5[0] = null
    array5[1] = "Kotlin"
    array5[2] = "test"

    println("array5 = ${array5.contentToString()} ")


//Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val array6 = arrayOf(1, 2, 3, 6, 5)
    val array6Copy = Array(array6.size) { 0 }
    for (i in array6Copy.indices) {
        array6Copy[i] = array6[i]
    }

    println("array6Copy = ${array6Copy.contentToString()} ")
//Создайте два массива целых чисел одинаковой длины. Создайте третий массив,
// вычев значения одного из другого.
    val array7 = arrayOf (7, 8, 9)
    val array8 = arrayOf(2, 3, 1)
    val diff = Array(array7.size) { 0 }
    for (i in diff.indices) {
        diff[i] = array7[i] - array8[i]
    }

    println("diff = ${diff.contentToString()} ")
//Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.
    val array9 = arrayOf(3, 0, 2, 7, 1)
    var index = 0
    var found = -1
    while (index < array9.size) {
        if (array9[index] == 5) {
            found = index
            break
        }
        index++
    }
    println(found)



//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val array10 = arrayOf(2, 3, 4, 5, 6)
    for (i in array10) {
        val type = if (i % 2 == 0) "чётное" else "нечётное"
        println(" array10:  $i $type")
    }

//Создай функцию, которая принимает массив строк и строку для поиска.
// Функция должна находить в массиве элемент, в котором принятая строка
// является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.
    fun findSubstring(arr: Array<String>, search: String): String {
        for (i in arr) {
            if (i.contains(search)) {
                return i
            }
        }
        return "Элемент ${search} не найден в массиве ${arr.contentToString()}"
    }

    val arr10 = arrayOf("Java", "Kotlin", "Apple")
    println(findSubstring (arr10, "qqq"))

// 2.Работа со списками List
//Создайте пустой неизменяемый список целых чисел.
    val list1: List<Int> = listOf()

//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val list2 = listOf("Hello", "World", "Kotlin")

//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val list3 = mutableListOf(1, 2, 3, 4, 5)

//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    list3.add(6)
    list3.add(7)
    list3.add(8)

    println("list3 = ${list3}")

//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val list4 = mutableListOf("Hello", "World", "Kotlin")
    list4.remove("World")

    println("list4 = ${list4}")

//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val list5 = listOf(10, 20, 30, 40)
    for (i in list5) {
        println(i)
    }

//Создайте список строк и получите из него второй элемент, используя его индекс.
    val list6 = listOf("Sun", "Moon", "Stars")
    val secondElement = list6[1] // "Moon"
    println(secondElement)

//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).
    val list7 = mutableListOf(1, 2, 3, 4)
    list7[2] = 99

    println("list7 = ${list7}")
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val list8 = listOf("A", "B")
    val list9 = listOf("C", "D")
    val resultList = mutableListOf<String>()
    for (i in list8) {
        resultList.add(i)
    }
    for (i in list9) {
        resultList.add(i)
    }
    println("resultList = $resultList")

//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val list10 = listOf(13, 24, 5, 32, 8)
    var min = list10[0]
    var max = list10[0]
    for (i in list10) {
        if (i < min) min = i
        if (i > max) max = i
    }
    println("Min = $min, Max = $max")

//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val list11 = listOf(2, 7, 6, 3, 9, 8)
    val evenList = mutableListOf<Int>()
    for (i in list11) {
        if (i % 2 == 0) {
            evenList.add(i)
        }
    }
    println("evenList = $evenList")

//3. Работа с Множествами Set
//Создайте пустое неизменяемое множество целых чисел.
    val set1: Set<Int> = setOf()

//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val set2 = setOf(1, 2, 3)

//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val set3 = mutableSetOf("Kotlin", "Java", "Scala")

//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    set3.add("Swift")
    set3.add("Go")

    println("set3 $set3")

//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val set4 = mutableSetOf(1, 2, 3, 4)
    set4.remove(2)

//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val set5 = setOf(4, 8, 15)
    for (elem in set5) {
        println(elem)
    }

//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    fun containsString(set: Set<String>, value: String): Boolean {
        for (elem in set) {
            if (elem == value)
                return true
        }
        return false
    }

    val set123 = setOf("apple", "banana", "cherry")
    val value1 = "banana"

    println("containsString = ${containsString(set123, value1)}")




//Создайте множество строк и конвертируйте его в список с использованием цикла.
    val set7 = setOf("a", "b", "c")
    val listFromSet = mutableListOf<String>()
    for (elem in set7) {
        listFromSet.add(elem)
    }
    println(listFromSet)

}