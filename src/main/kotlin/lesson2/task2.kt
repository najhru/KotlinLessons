package org.example.lesson2

fun main() {
    val employeesCount = 50
    val internsCount = 30

    val employeeSalary = 30000
    val employeesTotalSalary = employeesCount * employeeSalary

    val internSalary = 20000
    val internsTotalSalary = internsCount * internSalary

    val totalSalary = employeesTotalSalary + internsTotalSalary
    val averageSalary = totalSalary / (employeesCount + internsCount)

    println("Расходы на выплату зарплаты постоянных сотрудников: $employeesTotalSalary")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalary")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")
}