package ch03.regularexpressionsandtriplequotedstrings

// Use a regular expression.
fun parsePathRegex(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex() // No double backslash needed in triple quotes.
    val matchResult = regex.matchEntire(path)

    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, name: $fileName, ext: $extension")
    }
}

fun main() {
    parsePathRegex("/Users/yole/kotlin-book/chapter.adoc")
}
