package _iterator

fun main() {
    var a = 0

    while(a < 5) {
        println(a++)
    }

    a = 0
    do{
        println(++a)
    } while(a < 5)

    a = 0
    for(i in 0..9) {
        println(i)
    }

    for(j in 0..9 step 3) {
        println(j)
    }

    for(k in 9 downTo 0) {
        println(k)
    }
}