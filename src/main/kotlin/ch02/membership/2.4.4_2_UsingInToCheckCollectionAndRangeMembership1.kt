package ch02.membership

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know..."
}

fun main() {
    println(recognize('8'))


    println("Kotilin" in "Java".."Scala") // dictionary sequence check
    println("Kotlin" in setOf("Java", "Scala")) // collection sequence check
}
