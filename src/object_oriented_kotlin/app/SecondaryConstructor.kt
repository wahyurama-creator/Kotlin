package object_oriented_kotlin.app

import object_oriented_kotlin.data.Address
import object_oriented_kotlin.data.User

fun main() {
    val address1 = Address("jl. A", "Semarang")
    val address2 = Address("jl. B", "Jogja", "EN")

    println(address1.street)
    println(address1.city)
    println(address1.country)

    val user1 = User("wahyu", "rama")
    println(user1.username)
    println(user1.password)

}