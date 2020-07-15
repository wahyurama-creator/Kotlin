package object_oriented_kotlin.data

class Note(title: String) {
    var title: String = title
    get() = field
    set(value) {
        if (value.isNotEmpty())
            field = value
    }
}

class NoteBig(title: String) {
    val titleBig: String = title
        get() = field.toLowerCase()
}