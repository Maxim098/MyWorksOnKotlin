package Tasks

import kotlin.random.Random

fun main() {
    val mas: List<String> = listOf("+", "-", "*", "/")
    val a: Int = Random.nextInt(1, 10)
    val b: Int = Random.nextInt(1, 10)
    val oper: String = mas[Random.nextInt(0, mas.size-1)]
    var answer: String = "Ошибка"

    if (oper == "+") {
        answer = (a + b).toString()
    }
    else if (oper == "-") {
        answer = (a - b).toString()
    }
    else if (oper == "*") {
        answer = (a * b).toString()
    }
    else if (oper == "/") {
        if (b == 0) {
            answer = "Ошибка"
        }
        else {
            answer = (a / b).toString()
        }
    }

    print("$a $oper $b = $answer")
}