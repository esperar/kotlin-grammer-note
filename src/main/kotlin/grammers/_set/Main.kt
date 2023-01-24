package grammers._set

fun main() {
    var a = mutableSetOf("귤" , "바나나", "사과")

    for(item in a) {
        println("${item}")
    }

    a.add("수박")
    println(a)

    a.add("바나나")
    println(a)

    a.remove("바나나")
    println(a)

    println(a.contains("귤"))
}