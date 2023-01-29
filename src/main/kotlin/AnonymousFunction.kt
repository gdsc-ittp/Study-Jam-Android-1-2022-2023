fun main() {
    val stringTransformer = fun (text: String, type: String): String {
        return when (type) {
            "up" -> text.uppercase()
            "lo" -> text.lowercase()
            else -> text
        }
    }

    println(stringTransformer("Abdul", "up")) // ABDUL
    println(stringTransformer("Abdul", "lo")) // abdul
}