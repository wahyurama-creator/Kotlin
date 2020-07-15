package object_oriented_kotlin.app

import object_oriented_kotlin.data.Action

fun main() {
    fireAction(SampleAction())
    fireAction(object : Action {
        override fun action() {
            println("This is Anonymous class")
        }
    })
}

fun fireAction(action: Action) {
    action.action()
}

class SampleAction: Action {
    override fun action() {
        println("This is sample action")
    }
}