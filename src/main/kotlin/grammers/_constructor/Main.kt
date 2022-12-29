package grammers._constructor

fun main() {

    var a = Person("김희망")
    var b = Person("박준서")
    var c = Person("박주홍")
}

class Person(var name: String, val birthDay: Int) {
    init {
        println("인스턴스가 생성되었습니다.")
    }

    constructor(name: String) : this(name,1997) {
        println("1997년생 인스턴스가 생성되었습니다.")
    }
}