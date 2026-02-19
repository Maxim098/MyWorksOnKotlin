package StringTasks

fun main() {
    print("Введите строку: ")
    val line = readLine()!!
    println("Количество символов: " + line.length)
    println(String.format("Первый символ: %s\nПоследний символ: %s", line.first(), line.last()))
    println("Количество цифр: " + countCharsInLine(line, arrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9')))
    println("Количество пробелов: " + countCharInLine(line, ' '))
}

fun countCharInLine(line: String, char_: Char): Int {
    var count: Int = 0

    for (c in line) {
        if (c == char_) {
            count++
        }
    }

    return count
}

fun countCharsInLine(line: String, chars: Array<Char>): Int {
    var count: Int = 0

    for (c in line) {
        for (n in chars) {
            if (n == c) {
                count++
            }
        }
    }

    return count
}