fun main() {
    fun sayHello(name: String? = null): String {
        return if (name == null) {
            "Hello bro!"
        } else {
            "Hello, $name!"
        }
    }
    println(sayHello()) // Hello bro!
    println(sayHello("Abdul")) // Hello, Abdul!
}