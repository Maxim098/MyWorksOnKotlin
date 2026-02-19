package StringTasks

fun main() {
    print("Введите слово: ")
    val word = readLine()!!
    print(String.format("Длина слово '%s': %d", word, word.length))
}