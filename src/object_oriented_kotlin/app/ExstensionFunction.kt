package object_oriented_kotlin.app

import object_oriented_kotlin.data.Student
import object_oriented_kotlin.data.sayName
import object_oriented_kotlin.data.toUpperName

fun main() {
    val student = Student("Wahyu", 20)
    student.sayName("Wahyu")
    println(student.toUpperName)

    val myStudent = Student(null, null)
    myStudent.sayName("Rama")


}