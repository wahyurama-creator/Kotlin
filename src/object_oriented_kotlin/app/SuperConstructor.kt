package object_oriented_kotlin.app

import object_oriented_kotlin.data.Customer
import object_oriented_kotlin.data.ExecutiveCS
import object_oriented_kotlin.data.PremiumCS

fun main() {
    val customer = Customer("Andy", "Standard", 10L)
    println("${customer.name}, ${customer.type}, ${customer.balance}")

    val premiumCS = PremiumCS("Billy", "Premium", 0L)
    println("${premiumCS.name}, ${premiumCS.type}, ${premiumCS.balance}")

    val executiveCS = ExecutiveCS("Rosa", 10L)
    println("${executiveCS.name}, ${executiveCS.type}, ${executiveCS.balance}")
}