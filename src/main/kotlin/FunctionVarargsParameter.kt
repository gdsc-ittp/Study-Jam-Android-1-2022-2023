fun main() {
    val result = sumAll(10, 5, 15) // 30
    println(result)
}

fun sumAll(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}