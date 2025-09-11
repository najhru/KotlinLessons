package org.example.lesson1

fun main() {
    var seconds: Int = 6480
    val hours: Int = seconds / (60 * 60)
    val minutes: Int = seconds / 60 - hours * 60
    seconds = seconds - hours * 60 * 60 - minutes * 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}