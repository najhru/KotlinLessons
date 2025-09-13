package org.example.lesson2

import kotlin.math.pow

fun main() {
    val amount = 70000
    val rate = 16.70
    val years = 20

    val totalAmount = amount * (1 + rate/100).pow(years)

    totalAmount::class.simpleName

    println(String.format("%.3f", totalAmount))
}