package org.example.lesson4

/**
Задача 5* к Уроку 4

Научно-исследовательский корабль может приступить к долгосрочному плаванию при выполнении следующих условий:

- корабль не имеет повреждений;
- число экипажа составляет от 55 (включительно) до 70 человек (включительно);
- на борту есть более 50 ящиков провизии (не включительно);
- погода благоприятна или неблагоприятна.

Альтернативно, корабль может отплыть даже при наличии незначительных повреждений, при условии что:

- на борту рекомендованный состав экипажа 70 человек;
- погода благоприятная;
- на борту есть 50 и более ящиков провизии.

В качестве входных данных используй информацию, введенную через консоль:

- наличие повреждений корпуса (Boolean переменная);
- текущий состав экипажа;
- количество ящиков с провизией на борту;
- благоприятность метеоусловий (Boolean переменная).

Напиши программу, которая будет определять, может ли корабль отправиться в плавание. Программа должна анализировать эти данные и выводить результат в консоль. Для анализа должно использоваться единое составное условие, состоящие только из логических операторов.
*/

const val FAV_DAMAGE = false
const val FAV_MIN_TEAM = 55
const val FAV_MAX_TEAM = 70
const val FAV_MIN_PROVISIONS_BOXES = 51

const val REC_DAMAGE = true
const val REC_MAX_TEAM = 70
const val REC_WEATHER_GOOD = true
const val REC_MIN_PROVISIONS_BOXES = 50

fun main() {
    print("Наличие повреждений корпуса(true/false): ")
    val damage: Boolean = readlnOrNull().toBoolean()

    print("Текущий состав экипажа: ")
    val teamCount: Int = readlnOrNull()?.toInt() ?: 0

    print("Количество ящиков с провизией на борту: ")
    val provisionsBoxes: Int = readlnOrNull()?.toInt() ?: 0

    print("Благоприятность метеоусловий(true/false): ")
    val weatherGood: Boolean = readlnOrNull().toBoolean()

    var navigationApprove =
        damage == FAV_DAMAGE && teamCount >= FAV_MIN_TEAM && teamCount <= FAV_MAX_TEAM && provisionsBoxes >= FAV_MIN_PROVISIONS_BOXES  ||
                damage == REC_DAMAGE && teamCount == REC_MAX_TEAM && weatherGood == REC_WEATHER_GOOD && provisionsBoxes >= REC_MIN_PROVISIONS_BOXES

    println("Выход в море ${if (navigationApprove) "" else "не "}разрешен")

}
