package object_oriented_kotlin.app

import object_oriented_kotlin.data.Gender

fun main() {
    val men = Gender.MALE
    val women = Gender.FEMALE
    val all: Array<Gender> = Gender.values()

    val manStr = Gender.valueOf("MALE")
    val womenStr = Gender.valueOf("FEMALE")

    println(men)
    println(women)
    println(all.toList())
    men.showDesc()
    women.showDesc()
}

