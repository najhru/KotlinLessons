package org.example.lesson3

fun main() {
    val moveString = "D2-D4;0"

    var moveArr = moveString.split(';')
    val move = moveArr[1]

    moveArr = moveArr[0].split('-')
    val fromCell = moveArr[0]
    val toCell = moveArr[1]

    println(fromCell)
    println(toCell)
    println(move)
}