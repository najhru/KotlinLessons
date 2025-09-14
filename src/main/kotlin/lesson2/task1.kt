package org.example.lesson2

fun main() {

    val countOfStudent = 4
    val averageScore: Float = (3f + 4f + 3f + 5f) / countOfStudent

    println(String.format("%.2f", averageScore))
}