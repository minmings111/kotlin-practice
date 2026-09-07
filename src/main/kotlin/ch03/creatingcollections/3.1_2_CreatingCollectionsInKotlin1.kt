package ch03.creatingcollections

fun main() {
    val strings = listOf("first", "second", "fourteenth")

    println(strings.last())

    println(strings.shuffled())


    val numbers = setOf(1, 14, 2)

    println(numbers.sum())
}
