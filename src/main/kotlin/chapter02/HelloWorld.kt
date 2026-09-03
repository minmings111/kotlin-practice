package chapter02

fun main() {
    val input = readln()
    val name = if (input.isNotBlank()) input else "Kotlin"

    println("Hello, $name!")
    println("\$x")

    if (name.isNotBlank()) {
        println("Hello, ${name.length}-letter person!")
    }

    println("Hello, ${if (name.isBlank()) "someone" else name}!")
}