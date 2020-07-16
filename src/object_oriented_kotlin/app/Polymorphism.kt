package object_oriented_kotlin.app

import object_oriented_kotlin.data.Boss
import object_oriented_kotlin.data.Employee

fun main() {
    var employee: Employee = Employee(50)
    employee.myEmployee(50)

    employee = Boss(200)
    employee.myEmployee(150)
}