fun main() {
    displayValue(100)
}

tailrec fun displayValue(value: Int) {
    println(value)
    if (value > 0) {
        displayValue(value-1)
    }
}