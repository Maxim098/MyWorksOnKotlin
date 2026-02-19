package StringTasks

fun main() {
    val line = "apple,orange,banana"

    var array = line.split(",").toTypedArray()

    for (i in array.indices) {
        println(array[i])
    }
}