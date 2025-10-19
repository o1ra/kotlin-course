package org.example.org.kotlintest.lessons.lesson11.homework

//Задачи на сигнатуру метода.
//Напишите сигнатуру метода в которую входит модификатор доступа, название функции,
// список аргументов с типами и возвращаемое значение. В теле метода можешь сделать
// возврат объекта нужного типа если это требуется для устранения ошибок.

//1. Не принимает аргументов и не возвращает значения.
public fun func01(){

}
//2. Принимает два целых числа и возвращает их сумму.
public fun func02(a: Int, b: Int): Int {
    return a + b
}

//или
public fun func03(a: Int, b: Int): Int = a + b

//3. Принимает строку и ничего не возвращает.
public fun func04(a: String){
    print("Строка: ${a}")
}

//4. Принимает список целых чисел и возвращает среднее значение типа Double.
public fun fun05 (a: List<Int>): Double {
    var count = 0
    for (i in a){
        count += i
    }
    return count.toDouble() / a.size
}

//5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun func06(a: String?): Int? {
    return a?.length
}

//6. Не принимает аргументов и возвращает nullable вещественное число.
public fun func07(): Double?{
    return null
}

//7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun func08 (a: List<Int>?) = print(a)

//8. Принимает целое число и возвращает nullable строку.
public fun fun09(a: Int): String? = null

//9. Не принимает аргументов и возвращает список nullable строк.
public fun fun10():List<String?> = listOf(null, "example", null, "test")

//10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
public fun func11(a: String?, b: Int?): Boolean? = null

// Задачи на написание кода.
// Напишите валидную сигнатуру метода, а так же рабочий код для задач.
//11. Напишите функцию multiplyByTwo, которая принимает целое число и
// возвращает его, умноженное на 2.
fun multiplyByTwo(a: Int): Int = a * 2

//12. Создайте функцию isEven, которая принимает целое число и возвращает true,
// если число чётное, и false в противном случае.
fun isEven(a: Int): Boolean = a % 2 == 0

//13. Напишите функцию printNumbersUntil, которая принимает целое число n и
// выводит на экран числа от 1 до n. Если число n меньше 1, функция должна
// прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int){
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}
//14. Создайте функцию findFirstNegative, которая принимает список
// целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(a: List<Int>): Int?{
    for(i in a){
        if (i < 0) return i
    }
    return null
}

//15. Напишите функцию processList, которая принимает список строк.
// Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить
// выполнение с помощью return без возврата значения.
fun processList (a: List<String?>) {
    for (i in a){
        if (i == null){
            return
        }
        println(i)
    }
}