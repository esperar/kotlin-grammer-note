package grammers._conditional

fun main() {
    var a: Int = 10;

    if(a>10) {
        println("10 이상의 수 입니다.")
    } else {
        println("10 이상의 수가 아닙니다.")
    }

    var b = "Hope"
    doWhen(b)
}

fun doWhen(a: Any) {
    when(a) {
        1 -> println("1입니다.")
        "Hope" -> "Hope 라는 인자를 받았습니다"
        is Long -> "Long 타입의 인자를 받았습니다."
        !is String -> "String 타입이 아닌 인자를 받았습니다"
        else -> "무슨 인자를 받았는지 모름"
    }
}