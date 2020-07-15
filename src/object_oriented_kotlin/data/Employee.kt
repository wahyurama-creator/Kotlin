package object_oriented_kotlin.data

open class Employee(val employee: Int) {
    open fun myEmployee(employee: Int) {
        println("Gaji asli ${this.employee}, my employee : $employee")
    }
}

class Manage(employee: Int) : Employee(employee) {
    override fun myEmployee(employee: Int) {
        super.myEmployee(employee)
        println("It is Override method, $employee")
    }
}
// Kata kunci Final digunakan agar Tidak bisa berubah lagi pada fungsi tsb
class Boss(employee: Int) : Employee(employee) {
    final override fun myEmployee(employee: Int) {
        super.myEmployee(employee)
        println("It is Override method, $employee")
    }
}