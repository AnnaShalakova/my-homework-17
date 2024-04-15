package Task2

import java.time.LocalDate
import kotlin.math.roundToLong

fun main() {
    fun checkTypeData(obj: Any?) {
        if (obj is String)  {
            println("Я получил тип String = '$obj', ее длина равна ${obj.length} символ")
        }
        else if (obj is Int) {
            println("Я получил Int = '$obj', его квадрат равен ${obj * obj}")
        }
        else if (obj is Double) {
            println("Я получил Double = $obj, это число округляется до ${(obj * 100.0).roundToLong()/100.0}")
        }
        else if (obj is LocalDate) {
            val dateOfFoundationTinkoff = LocalDate.of(2006, 12, 24)
            if (obj < dateOfFoundationTinkoff) {
                println("Я получил LocalDate = $obj, эта дата меньше чем дата основания Tinkoff")
            }
        }
        else {
            if ( obj == null) {
                println("Объект равен null" )
            } else {
                println("Мне этот тип неизвестен(")
            }
        }
    }

    val exampleString = "Привет, Андрей,ну где ты был, ну обними меня скорей!"
    val exampleInt = 2
    val exampleDouble = 2.356
    val exampleLocalDate = LocalDate.of(2005, 11, 23)
    val exampleNullable = null
    val exampleBoolean = false

    checkTypeData(exampleString)
    checkTypeData(exampleInt)
    checkTypeData(exampleDouble)
    checkTypeData(exampleLocalDate)
    checkTypeData(exampleBoolean)
    checkTypeData(exampleNullable)
}