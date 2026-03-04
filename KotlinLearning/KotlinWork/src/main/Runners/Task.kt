package org.example.Runners

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun runner(name: String, time: Long) {
    println(name + " is running!")
    delay(time)
    println(name + " wins!!!")
    System.exit(0)
}

fun main() = runBlocking {
    println("RACE START!!!")

    launch{runner("Max", (500..2000).random().toLong())}
    launch{runner("Egor", (500..2000).random().toLong())}
    launch{runner("Dima", (500..2000).random().toLong())}
    launch{runner("Artem", (500..2000).random().toLong())}

    delay(3000)
}