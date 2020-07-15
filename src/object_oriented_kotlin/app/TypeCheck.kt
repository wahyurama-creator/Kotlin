package object_oriented_kotlin.app

import object_oriented_kotlin.data.HP
import object_oriented_kotlin.data.Laptop

fun main() {
    fun printObject(any: Any) {

/*      if (any is Laptop) {
            println("Laptop ${any.name}")
        } else if (any is HP) {
            println("HP ${any.brand}")
        } else {
            println("Not same but is $any")
        }
*/
        when (any) {
            is Laptop -> println("Laptop ${any.name}")
            is HP -> println("HP ${any.brand}")
            else -> println("Not same but is $any")
        }
    }

    fun printString(any: Any) {
        // Cara tidak aman
//        val value = any as String
        // Cara yang lebih aman
        val value = any as? String
        println(value)
    }

    printObject("wahyu")
    printObject(10)
    printObject(Laptop("ACER"))
    printObject(HP("SAMSUL"))

    printString("Rama")
    printString(10)
}