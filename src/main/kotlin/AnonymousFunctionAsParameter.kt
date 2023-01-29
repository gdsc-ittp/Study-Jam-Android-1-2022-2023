fun main() {
    val result = hello("Abdul", fun (value: String): String {
        if (value.isEmpty()) {
            return "Ups"
        }
        return value.uppercase()
    })
}