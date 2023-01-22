package grammers._enum

fun main() {
    var a = State.RED
    println(a)

    a = State.BLUE
    println(a.isRed())

    a = State.RED
    println(a.isRed())
    println(a.message)
}

enum class State(val message: String) {
    RED("빨간색"),
    BLUE("파란색"),
    YELLOW("노란색");

    fun isRed() = this == State.RED
}

