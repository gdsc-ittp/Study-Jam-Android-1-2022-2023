fun main() {
    fullName(
        firstName = "Abdul",
        middleName = "Hafiz",
        lastName = "Ramadan"
    )
}

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hello, $firstName $middleName $lastName")
}