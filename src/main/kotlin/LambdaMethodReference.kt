fun main() {
    val lambdaName: (String) -> String = ::toUpper
    println(lambdaName("Abdul")) // ABDUL
}

fun toUpper(value: String): String = value.uppercase()
