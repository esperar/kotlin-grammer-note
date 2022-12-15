package _abstract

fun main() {
    var a = Rabbit()
    a.sniff()
    a.eat()
}

abstract class Animal {
    abstract fun eat()
    fun sniff() {
        println("킁킁킁킁킁ㅋ으킁")
    }
}

class Rabbit : Animal() {
    override fun eat() {
        println("냠냠냠냠냠냠냠")
    }
}