package grammers._data

fun main() {

    val a = General("희망" , 123)

    println(a == General("희망",123)) // false
    println(a.hashCode()) // hashCode 가 잘 구현되지 않음
    println(a) // toString 이 잘 구현되지 않음

    val b = Data("주홍이",1234)
    println(b == Data("주홍이",1234)) // true
    println(b.hashCode())
    println(b)

    println(b.copy()) // 원본을 복사한 새 객체를 쉽게 만들 수 있음
    println(b.copy(name = "승제"))
    println(b.copy(id = 12341))
}

class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)