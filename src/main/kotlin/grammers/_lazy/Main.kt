package grammers._lazy

fun main() {

    val number: Int by lazy{
        println("초기화 합니다.")
        7
    }

    println("코드를 시작합니다")
    println(number)
    println(number)
}