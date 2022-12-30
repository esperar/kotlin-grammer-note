package grammers._infix

fun main() {
    read(4)
    read("감사요")

    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북",4,"학교")
    deliveryItem("선물", destination = "친구집")

    sum(1,2,3,4)

    println(6 multiply 4)
    println(6.multiply(4))
}

// overloading
fun read(x : Int) {
    println("$x 입니다.")
}

fun read(x: String) {
    println(x)
}

// default args
fun deliveryItem(name: String, count: Int = 1, destination: String ="집") {
    println("${name}, ${count}개를 ${destination}에 배달하였습니다.")
}

// varargs
fun sum(vararg numbers: Int) {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    println(sum)
}

// infix
infix fun Int.multiply(x: Int): Int = this * x