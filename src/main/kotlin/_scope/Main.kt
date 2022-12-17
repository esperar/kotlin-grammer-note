package _scope

val a = "패키지 스코프"

class B {
    fun print() {
        println(a)
    }
}

fun main() {
    val a = "함수 스코프"
    println(a)
    B().print()
}