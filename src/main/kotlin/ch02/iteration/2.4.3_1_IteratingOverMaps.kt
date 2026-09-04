package ch02.iteration

fun main() {
    // make empty map.
    // key is char type, value is string type
    val binaryReps = mutableMapOf<Char, String>()

    for (char in 'A'..'F') {
        // change: char('A') -> binary String("1000001")
        val binary = char.code.toString(radix = 2)
        // save to map:
            // char('A') saved in key
            // binary String("1000001") saved in value
        binaryReps[char] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}
