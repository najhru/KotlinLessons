package org.example.lesson2

fun main() {
    val gain = 20f
    val crystalMineral = 7
    val ironMineral = 11

    val crystalMineralGain = (crystalMineral * gain / 100).toInt()
    val ironMineralGain = (ironMineral * gain / 100).toInt()

    println("Бонусная кристаллическая руда: $crystalMineralGain")
    println("Бонусная железная руда: $ironMineralGain")
}