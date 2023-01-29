fun main() {
    val grade: Any = 'B'
    when (grade) {
        is Int -> println("A Int")
        is Char -> println("A Char")
        else -> println("Known type")
    }
}