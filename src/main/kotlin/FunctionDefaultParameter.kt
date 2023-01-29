fun main() {
    hello("Abdul", "Ramadan")
    hello("Study Jam Android #4")
}

fun hello(firstName: String, lastName: String = "") {
    println("Hello $firstName $lastName")
}