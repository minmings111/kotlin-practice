package ch02.exceptions

fun getPercentage(number: Int): Int =
    if (number in 0..100)
        number
    else
        throw IllegalArgumentException(
            "A percentage value must be between 0 and 100: $number"
        )

fun main() {
    println(getPercentage(50))
}
