package object_oriented_kotlin.program

import object_oriented_kotlin.annotations.Fancy

@Fancy(authors = "Rama")
class MyApp(val name: String, val ver: Int) {
    fun info(): String = "App $name, $ver"
}