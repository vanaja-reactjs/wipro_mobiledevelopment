fun main() {
    val userName = "Swamy"
    fun getGreeting(name: String): String {
        return "Hello, $name! Welcome to our world"
    }
    val welcomeMessage = "Dear $userName,\n${getGreeting(userName)}"

    println(welcomeMessage)
}