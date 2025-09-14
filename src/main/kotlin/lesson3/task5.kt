package org.example.lesson3

fun main() {
    val moveString = "D2-D4;0"
    val fromCell = moveString.substring(0, 2)
    val toCell = moveString.substring(3, 5)
    val move = moveString.substring(6, 7)

    println(fromCell)
    println(toCell)
    println(move)
}