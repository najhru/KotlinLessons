package org.example.lesson1

fun main() {
    val ordersCount: Int = 75
    val messageCongratulation: String = "Поздравляем с покупкой!"

    println("messageCongratulation: $messageCongratulation")
    println("Кол-во заказов: $ordersCount")

    var workersCount: Int = 2000
    //println("Кол-во работников: $workersCount")

    workersCount--
    println("Кол-во работников: $workersCount")
}