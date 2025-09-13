package org.example.lesson2

const val MINUTES_IN_HOUR = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457

    val arrivalTime = departureHour * MINUTES_IN_HOUR + departureMinute + travelTime
    val arrivalHour = arrivalTime / MINUTES_IN_HOUR
    val arrivalMinute = arrivalTime % MINUTES_IN_HOUR

    println(String.format("Время прибытия: %02d:%02d", arrivalHour, arrivalMinute))
}