package object_oriented_kotlin.app

import object_oriented_kotlin.data.Game
import object_oriented_kotlin.data.Login
import object_oriented_kotlin.data.MinMax

fun main() {
    val game = Game("Game", 10)
    val (name, price) = game
    println(name)
    println(price)

//    val result = minMax(10,50)
    val (min, max) = minMax(10,50)
    println(min)
    println(max)

    val login =  Login("wahyu", "rama")
//    login(login) { login ->
//        login.user == "wahyu" && login.password == "rama"
//    }
    login(login){ (user, password) ->
        user == "wahyu" && password == "rama"
    }
    println(login)
}

fun minMax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value2)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}