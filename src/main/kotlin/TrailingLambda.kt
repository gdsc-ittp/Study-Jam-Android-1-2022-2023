fun main() {
    val result1 = hello("Abdul") { value: String ->
        value.uppercase()
    }
    val result2 = hello("Abdul") { value: String ->
        value.lowercase()
    }
}