package grammers._override

fun main() {
    var a = Tiger();
    a.eat(); // 고기를 먹습니다.
}

open class Animal() {
    open fun eat() {
        println("음식을 먹다.")
    }
}

class Tiger: Animal() {
    override fun eat() {
        println("고기를 먹습니다.")
    }
}