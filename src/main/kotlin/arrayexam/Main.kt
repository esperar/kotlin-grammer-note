package arrayexam

fun main() {
    var intArr = arrayOf(1,2,3,4) // 배열 선언
    var nullArr = arrayOfNulls<Int>(5) // 비어있는 배열 선언 arrayOfNulls<Type>(size)

    intArr[2] = 8
    println(intArr[4])
}