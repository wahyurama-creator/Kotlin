package object_oriented_kotlin.app

import object_oriented_kotlin.data.Employee
import object_oriented_kotlin.data.Manage

fun main() {
    val employee = Employee(100)
    val manage = Manage(50)

    employee.myEmployee(employee = 120)
    manage.myEmployee(45)
}