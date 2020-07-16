package object_oriented_kotlin.app

import object_oriented_kotlin.data.Student

fun main() {
    val student = Student("Wahyu", 20)
    val result= student.let {
        println(it.name)
        println(it.age)
    }
    println(result)

    val result2 = student.run {
        println(this.name)
        println(this.age)
    }
    println(result2)

    val result3: Student = student.apply {
        println(this.name)
        println(this.age)
    }
    println(result3)

    val result4: Student = student.also {
        println(it.name)
        println(it.age)
    }
    println(result4)

    val result5: String = with(student) {
        println(this.name)
        println(this.age)
    }.toString()
    println(result5)
}