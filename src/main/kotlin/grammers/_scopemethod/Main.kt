package grammers._scopemethod

fun main() {

    // run, with, apply 는 Context Object 를 "this" 로 참조합니다.
    // 따라서, 람다식 안에서는 일반 클래스 멤버처럼 사용할 수 있습니다.

    // let, also 는 Context Object 를 "it" 로 참조합니다.
    // 따로 전달 인자명을 지정할 수도 있고, 지정하지 않으면 기본적으로는 "it" 로 접근하게 됩니다.

    var price = 5000

    var b = Book("코틀린" , 10000).apply {
        name = "[초특가]" + name
        discount()
    }

    b.run {
        println("상품명 ${name} 가격 ${price}")
    }

    b.let{
        println("상품명 ${it.name} 가격 ${it.price}")
    }

}

class Book(var name: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}