package org.example

import kotlinx.coroutines.*

suspend fun cook(name: String, time: Long) {
        println("Начало приготавления " + name)
        delay(time)
        println(name + "приготовилось!")
}

suspend fun takeOrder(orderNumber: Int) {
    println("Заказ номер ${orderNumber} начинает готовиться")

    cook("кофе", 400)
    cook("сэндвич", 1000)

    println("Заказ номер ${orderNumber} готов!")
}

fun main() = runBlocking {
    println("Кофейня открылась")

    launch { cook("кофе", 400) }
    launch { takeOrder(3) }
    launch { cook("блины", 1200) }

    println("Кофейня закрылась")
}