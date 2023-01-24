package grammers._collection_method2

fun main() {
    data class Person(val name: String, val birthYear: Int)

    val personList = listOf(
        Person("주홍",2006),
        Person("승제",2006),
        Person("가짜이승제",2004),
        Person("가짜박주홍",1999)
    )

    // 중괄호안의 값 기준으로 맵을 생성
    println(personList.associateBy{ it.birthYear })

    // 중괄호안의 값을 기준으로 묶음
    println(personList.groupBy { it.name })

    // 조건에 맞는 값은 첫번째에 아닌값은 두번째 값에 들어감
    val (over98, under98) = personList.partition { it.birthYear > 2000 }
    println(over98)
    println(under98)

    val numberList = listOf(1,2,3,4,10,-1)
    // 중괄호안에 리스트값을 추가해줌
    println(numberList.flatMap { listOf(it * 10 , it + 10) })

    // 괄호안에 지정한 인덱스에 객체가 존재하면 반환 없으면 중괄호 안의 값을 반환
    println(numberList.getOrElse(1){50})
    println(numberList.getOrElse(10){50})

    val names = listOf("A", "B", "C", "D")

    // 컬렉션의 아이템을 1:1로 매칭하여 새 컬렉션을 만듬 사이즈는 더 작은 컬렉션을 따름
    println(names zip numberList)
}