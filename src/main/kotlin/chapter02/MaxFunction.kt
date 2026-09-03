package chapter02

fun main() {
    println(max(1,2))
    println(max2(3,4))
}

fun max(a: Int, b: Int): Int {
//    "if" is an expression.
//    so Kotlin has no ternary operator.

//    bock body function
    return if (a > b) a else b
}

// expression body function
fun max2(a: Int, b: Int): Int = if(a > b) a else b


// type inference
fun max3(a: Int, b: Int) = if(a > b) a else b