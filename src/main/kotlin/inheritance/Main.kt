package inheritance

fun main() {

    var a = Dog("주홍이" , 17)
    var b = Cat("승제", 177)

    a.bark()
    b.meow()
}

open class Animal(var name: String, var age: Int, var type: String) {
    fun introduce() {
        println("저는 $name 이고 $age 살이며 $type 입니다.")
    }
}

class Dog(name: String, age: Int) : Animal(name, age , "개") {
    fun bark() {
        println("멍멍")
    }
}

class Cat(name: String, age: Int) : Animal(name, age, "고양이") {
    fun meow() {
        println("야옹야옹")
    }
}