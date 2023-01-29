fun main() {
    val lambdaBioData: (String, Int) -> String =
        { name: String, age: Int ->
            "Hello $name, age = $age"
        }
    println(lambdaBioData("Abdul", 20)) // ABDUL
}