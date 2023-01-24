package grammers._collection_method

fun main() {
    var nameList = listOf("박주홍","박주봉","유연성","이용대","김희망","응꾸엔양양")

    nameList.forEach{ print(it + " ") }
    println()

    println(nameList.filter{ it.startsWith("김") })
    println(nameList.map { "이름 :" + it })

    println(nameList.any{it == "박주홍"})
    println(nameList.all { it.length == 3 })
    println(nameList.none{ it.startsWith("꿔")})

    println(nameList.first{it.startsWith("김")})
    println(nameList.last{it.startsWith("김")})

    println(nameList.count{it.contains("주")})
}