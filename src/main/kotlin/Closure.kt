fun main() {
    var counter = 0
    println("Counter : $counter") // 0

    val lambdaIncrement: () -> Unit = {
        println("Increment")
        counter++
    }
    lambdaIncrement()
    lambdaIncrement()

    println("Counter: $counter") // 2
}