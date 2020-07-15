package object_oriented_kotlin.app

import object_oriented_kotlin.data.Note
import object_oriented_kotlin.data.NoteBig

fun main() {
    val note = Note("NOTE")
    println(note.title)

    val noteBig = NoteBig("Big Note")
    println(noteBig.titleBig)
}