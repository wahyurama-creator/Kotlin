package basic_kotlin

fun loopBreak() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i > 2) break@loopI
            println("$i * $j = ${i*j}")
        }
    }
}

fun loopContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i == 2) continue@loopI
            println("$i * $j = ${i*j}")
        }
    }
}

fun main() {
    fun test(name: String, param: (String) -> Unit) = param(name)

    test("wahyu") test@ {
        if (it == "") {
            return@test
        } else {
            println(it)
        }
    }

}