package classexam

fun main() {

    var a = Person("김희망" , 20060206)
    var b = Person("박주홍" , 20060715)
    var c = Person("박준서" , 20060331)

    a.introduce();
}

class Person(var name: String , val birthDay: Int ){
    fun introduce() {
        println("안녕하세요 저는 $name 이고 생일은 $birthDay 입니다.")
    }
}