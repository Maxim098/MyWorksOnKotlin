fun main() {
    print("Введите число минут: ")
    val countMin: String? = readLine()

    var hours: Int
    val min: Int

    if (countMin != null) {
        min = countMin.toInt() % 60
        hours = countMin.toInt() - min
        hours = countMin.toInt() / 60

        println("${countMin} минут - это ${hours} часа ${min} минут")
    }
}