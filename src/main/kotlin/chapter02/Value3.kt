package chapter02

fun canPerformOperation(): Boolean {
    return true
}

fun main() {
    val result: String

    if (canPerformOperation()) {
        result = "Success"
    }
    else {
        result = "Can't perform operation"
    }
}
