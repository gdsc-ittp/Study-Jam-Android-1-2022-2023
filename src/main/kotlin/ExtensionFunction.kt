fun main() {
    val name = "Abdul"
    name.sayHello() // Hello, Abdul
}

fun String.sayHello() {
    println("Hello, $this")
}
