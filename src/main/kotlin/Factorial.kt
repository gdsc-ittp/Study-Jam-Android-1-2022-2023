tailrec fun factorialTailRecursive(
    value: Int,
    total: Int = 1
): Int {
    return when (value) {
        1 -> total
        else -> factorialTailRecursive(
            value - 1,
            total * value
        )
    }
}

fun factorialRecursive(value: Int): Int {
    return when (value) {
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}

fun factorialLoop(value: Int): Int {
    var result = 1
    for (number in value downTo 1) {
        result *= number
    }
    return result
}
