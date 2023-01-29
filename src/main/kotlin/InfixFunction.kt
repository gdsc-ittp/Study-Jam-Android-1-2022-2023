fun main() {
    val result1 = "Abdul".toTransform( "up") // ABDUL
    val result2 = "Abdul" toTransform  "lo" // abdul

    println(result1)
    println(result2)
}

infix fun String.toTransform(type: String): String {
    return when (type) {
        "up" -> this.uppercase()
        "lo" -> this.lowercase()
        else -> this
    }
}
