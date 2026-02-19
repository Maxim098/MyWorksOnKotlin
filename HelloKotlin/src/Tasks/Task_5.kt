package Tasks

fun main() {
    val temperature: String
    val precipitation: String

    print("Введите температуру: ")
    temperature = readLine()!!
    print("Введите колиество осадков: ")
    precipitation = readLine()!!

    val report = """
        Погода сегодня:
        Температура: $temperature
        Оадки: $precipitation
    """.trimIndent()

    print("\n$report")
}