package grammers._variable

fun main() {
    var a:Int = 1
    val b:Int = 3

    println(a);
    println(b);

    var charVariable:Char = 'a'
    val charVariable2 = 'a' // nullable

    var stringVariable = "Hi I'm hope"
    val stringVariable2 = """
        Hello My Name is Kim Hope. 
        Nice to meet you.
    """

    // var 기본적인 변수 val 초기화만 가능 변경 불가능
    // 변수명:type 타입 지정 -> null을 허용하지 않음
    // type 지정을 하지않으면 nullable 신중히 사용해야함
}