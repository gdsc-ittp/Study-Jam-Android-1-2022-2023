fun main() {
    val lambdaName: (String) -> String = {
        it.uppercase()
    }
    println(lambdaName("Abdul")) // ABDUL
}