package _generic

fun main() {
    UsingGeneric(A()).doShouting()
    UsingGeneric(B()).doShouting()
    UsingGeneric(C()).doShouting()

    doShouting(B())
}

fun<T : A> doShouting(t: T) {
    t.shout()
}

open class A {
    open fun shout() {
        println("A가 소리칩니다 박주홍붕쉰이라고")
    }
}

class B: A(){
    override fun shout() {
        println("B가 소리칩니다 박주홍은바보라고")
    }
}

class C: A() {
    override fun shout() {
        println("박주홍 죽고싶나 C")
    }
}

class UsingGeneric<T:A> (val t: T) {
    fun doShouting() {
        t.shout()
    }
}