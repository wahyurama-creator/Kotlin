package object_oriented_kotlin.app

import object_oriented_kotlin.data.StudentTeach
import object_oriented_kotlin.data.Teacher

fun main() {
    val teacher = Teacher("Ana")
    println(teacher.name)

    val student = StudentTeach("Maria")
    println(student.name)
    println(student.nameParam)
}