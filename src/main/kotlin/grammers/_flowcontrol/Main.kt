package grammers._flowcontrol

fun main() {

    loop@for(i in 0..9) {
        for(j in 1 .. 9) {
            if(i == 1 && j == 2)
                break@loop
        }
    }

    // 코틀린은 다른 언어와 다르게 다중으로 중첩된 반복문을 라벨을 통해 한번에 탈출 가능하다.
}