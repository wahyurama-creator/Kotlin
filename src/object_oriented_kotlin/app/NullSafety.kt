package object_oriented_kotlin.app

data class Friend(val name: String)

fun goodBye(friend: Friend?) {
//    if (friend != null) {
//        println("Hello my friend: ${friend.name}")
//    } else {
//        println("Im sorry this value is NULL")
//    }

    // Elvis  operator
    val name = friend?.name ?: "its null"
    println(name)

//    val name = friend!!.name
//    println(name)
}

fun main() {
    goodBye(Friend("Red"))
    goodBye(friend = null)
}