package grammers._class2

fun main() {
    Outer.Nested().introduce()

    val outer = Outer()
    var inner = outer.Inner()

    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Change Outer Class"
    inner.introduceOuter()
}

class Outer{
    var text = "Outer class"

    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }

    inner class Inner {
        var text = "Inner Class"

        fun introduceInner() {
            println(text)
        }

        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}