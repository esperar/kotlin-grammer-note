package `_function`

fun main() {
    val addValue = add(1, 2, 3)
    println(addValue)

    val addValueToFunction = addToVariable(1,2,3)
    println(addValue)

}


// return 사용시 타입을 명시해줘야 한다.
fun add(a: Int, b: Int, c: Int): Int{
    return a + b + c
}

// 반환형을 생략할 수 있습니다.
fun addToVariable(a: Int, b: Int, c: Int) = a + b + c