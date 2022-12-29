package grammers._typeconvert

fun main() {
    var a: Int = 1234
    // var failedConvertA: Long = a

    var b: Int = 1234
    var successConvertB: Long = b.toLong()

    // 코틀린에서는 암시적 형변환이 아닌 명시적 형 변환이다.
    // to + type() 메서드를 통해 형변환 작업을 한다.
}