package object_oriented_kotlin.data

import kotlin.properties.Delegates

class Account(desc: String = "") {
    val id: String by lazy {
        println("My ID Called")
        "Id"
    }

    var description: String by Delegates.observable(desc) {
            property, oldValue, newValue ->
        println("${property.name}, OldValue: $oldValue, Change to: $newValue")
    }
}