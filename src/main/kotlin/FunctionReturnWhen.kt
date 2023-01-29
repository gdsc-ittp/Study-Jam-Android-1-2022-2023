fun main() {
    fun transformString(text: String, type: String): String {
        return when (type) {
            "up" -> text.uppercase()
            "lo" -> text.lowercase()
            else -> text
        }
    }
    println(transformString("Abdul", "up")) // ABDUL
    println(transformString("Abdul", "lo")) // abdul
}