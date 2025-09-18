package org.example.lesson5

/**
Задача 5* к Уроку 5

Для алгоритма улучшенного приложения-лотереи нужно угадать три числа от 0 до 42. Пользователь вводит числа через консоль.

Требования к программе:

- Загаданные числа должны рандомно генерироваться при каждом запуске программы и храниться в списке.
- Поочередно введенные пользователем числа должны также храниться в списке.
- Для определения совпадений используй метод intersect() и сохрани размер полученной коллекции в отдельную переменную.

В зависимости от количества угаданных чисел программа выводит результат:

- При трех совпадениях сообщается, что пользователь угадал все числа и выиграл джекпот.
- При двух совпадениях информируется о том, что пользователь угадал два числа и получает крупный приз.
- Если угадано одно число, пользователю выплачивается утешительный приз.
- Если нет совпадений, программа сообщает, что пользователь не угадал ни одного числа.
- В конце игры вне зависимости от результата программа выводит выигрышные числа.
*/

const val MIN_NUMBER_VALUE = 0
const val MAX_NUMBER_VALUE = 42
const val COUNT_NUMBERS = 3

fun main() {
    val range = (MIN_NUMBER_VALUE..MAX_NUMBER_VALUE)

    val lotteryNumbers: ArrayList<Int> = ArrayList()
    for (i in 1..COUNT_NUMBERS) {
        lotteryNumbers.add(range.random())
    }

    var inputNumbersCount = 1
    val inputNumbers: ArrayList<Int> = ArrayList()
    while (inputNumbersCount <= COUNT_NUMBERS) {
        print("Введите $inputNumbersCount число: ")
        val number = readln().toIntOrNull() ?: -1
        if (number !in range)
            continue
        inputNumbersCount++
        inputNumbers.add(number)
    }

    val intersectSet = lotteryNumbers.intersect(inputNumbers.toSet())
    when {
        intersectSet.size == COUNT_NUMBERS -> println("Угаданы все числа и выигран джекпот!")
        intersectSet.size == 2 -> println("Угаданы два числа и получаете крупный приз!")
        intersectSet.size == 1 -> println("Вы выиграли утешительный приз!")
        else -> println("Не угадал ни одного числа!")
    }

    println("Загаданные числа: ${lotteryNumbers.joinToString(", ")}")
}