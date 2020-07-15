package object_oriented_kotlin.data

data class Fruit(val qty: Int) {
    operator fun plus(fruit: Fruit): Fruit {
        println(message = "This Qty: ${this.qty}, and Fruit qty: ${fruit.qty}")
        return Fruit(this.qty + fruit.qty)
    }
    operator fun minus(fruit: Fruit): Fruit {
        println(message = "This Qty: ${this.qty}, and Fruit qty: ${fruit.qty}")
        return Fruit(this.qty - fruit.qty)
    }
}