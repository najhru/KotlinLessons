package org.example.lesson5

import kotlin.random.Random

/**
Задача 1 к Уроку 5

Нужно написать часть модуля для авторизации пользователя. Для входа в приложение пользователь должен доказать, что он не бот. Для этого программа предлагает решить простой математический пример – сложить два числа (сообщить об этом пользователю).

Имитируй эти действия в консоли, путем считывания данных с клавиатуры. При успешном решении вход в программу символизируется сообщением “Добро пожаловать!". В противном случае вывести сообщение "Доступ запрещен."
 */
const val MIN_VALUE = 1
const val MAX_VALUE = 10

fun main() {
    val random = Random
    val number1 = random.nextInt(MIN_VALUE, MAX_VALUE)
    val number2 = random.nextInt(MIN_VALUE, MAX_VALUE)

    print("Для входа нужно решить пример $number1 + $number2 = ")
    val answer: Int = readln().toIntOrNull() ?: -1
    println(if (answer == number1 + number2) "Добро пожаловать!" else "Доступ запрещен.")
}