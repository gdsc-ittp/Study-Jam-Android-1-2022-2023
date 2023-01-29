fun main() {
    val lambdaName: (String) -> String = { value: String ->
        value.uppercase()
    }
    println(lambdaName("Abdul"))
}