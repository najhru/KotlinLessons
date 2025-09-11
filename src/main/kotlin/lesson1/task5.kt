package org.example.lesson1

fun main() {
    val secondsInMinute = 60
    val minutesInHour = 60

    var seconds: Int = 6480
    val hours: Int = seconds / (minutesInHour * secondsInMinute)
    val minutes: Int = seconds / secondsInMinute - hours * minutesInHour
    seconds = seconds - hours * minutesInHour * secondsInMinute - minutes * secondsInMinute

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}