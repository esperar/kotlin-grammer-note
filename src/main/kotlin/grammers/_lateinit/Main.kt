package grammers._lateinit

fun main() {

    val a = LateInitSample()

    println(a.getLateInitText())
    a.text = "새로운 할당 값"
    println(a.getLateInitText())
}

class LateInitSample {
    lateinit var text: String

    fun getLateInitText(): String {
        if(::text.isInitialized) {
            return text
        } else {
            return "기본값"
        }
    }
}