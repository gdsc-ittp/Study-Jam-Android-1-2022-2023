fun main() {
    val name = "Abdul"
    val helloNamed = name.hello() // Hello, Abdul
}

fun String.hello(): String {
    return "Hello, $this"
}
