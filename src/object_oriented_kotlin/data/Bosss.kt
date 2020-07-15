package object_oriented_kotlin.data

class Bosss(val name: String) {
    inner class Employee(val nameParam: String) {
        fun urEmployee() {
            println("Hello Im: $nameParam, my Boss: ${this@Bosss.name}")
        }
    }
}