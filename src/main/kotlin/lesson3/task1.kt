package org.example.lesson3

fun main() {
    val welcomeMessageForEvening = "Добрый вечер"
    val welcomeMessageForDay = "Добрый день"
    val userName = "Никита"

    var welcomeMessage = "$welcomeMessageForDay, $userName!"
    println(welcomeMessage)

    welcomeMessage = "$welcomeMessageForEvening, $userName!"
    println(welcomeMessage)
}