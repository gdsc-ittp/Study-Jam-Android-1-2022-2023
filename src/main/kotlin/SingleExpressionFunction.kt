fun main() {
    val result = double(5) // 20
    hi("Abdul")
}

fun double(number: Int): Int = number * 2

fun hi(name: String): Unit = println("Hi $name")
