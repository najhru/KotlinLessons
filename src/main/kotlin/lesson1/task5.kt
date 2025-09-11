package org.example.lesson1

const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOUR = 60

fun main() {
    var seconds: Int = 6480
    val hours: Int = seconds / (MINUTES_IN_HOUR * SECONDS_IN_MINUTE)
    val minutes: Int = seconds / SECONDS_IN_MINUTE - hours * MINUTES_IN_HOUR
    seconds = seconds - hours * MINUTES_IN_HOUR * SECONDS_IN_MINUTE - minutes * SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}