fun main() {
    val upperTransformer = { value: String -> value.uppercase() }
    val lowerTransformer = { value: String -> value.lowercase() }
    println(hello("Abdul", upperTransformer))
    println(hello("Abdul", lowerTransformer))
}

fun hello(
    value: String,
    transformer: (String) -> String
): String {
    return "Hello, ${transformer(value)}"
}