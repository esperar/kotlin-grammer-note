package grammers._null

import java.util.Properties

fun main() {
    var a :String? = null

    println(a?.uppercase())
    println(a?:"default".uppercase())
    println(a!!.uppercase())

    a.run {
        println(uppercase())
        println(lowercase())
    }

    val b = Product("콜라" , 1000)
    val c = Product("콜라", 1000)
    val d = b
    val e = Product("사이다" , 1000)

    println(b == c)
    println(b === c)

    println(c == d)
    println(c === d)

    println(b == e)
    println(b === e)
}

class Product(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if(other is Product)
            return other.name == name && other.price == price
        else
            return false
    }
}