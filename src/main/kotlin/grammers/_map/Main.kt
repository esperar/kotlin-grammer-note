package grammers._map

fun main(){
    val a = mutableMapOf("박주홍" to "박주봉", "이승제" to "물고기")

    for(entry in a) {
        println("${entry.key} to ${entry.value}")
    }

    a.put("김희망" , "백겐드")
    println(a)

    a.remove("박주홍")
    println(a)

    println(a["이승제"])
}