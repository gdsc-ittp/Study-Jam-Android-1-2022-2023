fun main() {
    printAverageGrade("Abdul",95, 89, 78)
}

fun printAverageGrade(name: String,vararg numbers: Int) {
    var result = 0.0
    for (number in numbers) {
        result += number
    }
    result /= numbers.size
    printHello("Nilai Rata-Rata: $name = $result")
}