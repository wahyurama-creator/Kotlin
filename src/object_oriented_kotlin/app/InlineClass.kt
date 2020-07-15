package object_oriented_kotlin.app

import object_oriented_kotlin.data.Token

fun main() {
    val token = Token("TOKEN")
    println(token.value)
    println(token.lengthTok())
}