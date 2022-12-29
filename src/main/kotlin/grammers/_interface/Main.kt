package grammers._interface

fun main() {
    var dog = Dog()

    dog.eat()
    dog.run()
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("냠냠냠냠냠")
    }
}

class Dog: Runner, Eater {
    override fun run() {
        println("후다다다다다다다닥")
    }

    override fun eat() {
        println("우걱우걱우걱우걱우걱")
    }
}