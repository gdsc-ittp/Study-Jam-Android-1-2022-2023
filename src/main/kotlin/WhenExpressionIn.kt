fun main() {
    val grade = 'B'
    val passGrades = arrayOf('A', 'B', 'C')
    when (grade) {
        in passGrades -> println("Passed")
        else -> println("Try again next year")
    }
}