class User(private val username: String, private val password: String) {
        private var loggedIn = false
        fun login(enteredUsername: String, enteredPassword: String): Boolean {
            if (enteredUsername == username && enteredPassword == password) {
                loggedIn = true
                println("Login successful!")
                return true
            } else {
                println("Invalid username or password. Please try again.")
                return false
            }
        }

        // Method to display summary of expenses
        fun displayExpenseSummary() {
            if (loggedIn == true) {
                println("Expense Summary for $username:")
                println("Total Expenses: \$500")
                println("Average Daily Expenses: \$50")
            } else {
                println("Please login first to view your expense summary.")
            }
        }
    }

    fun main() {

        val user = User("vanaja", "vanaja@123")


        user.login("vanaja", "vanaja@123")


        user.displayExpenseSummary()


        user.login("vanaja", "wrongpassword")


        user.displayExpenseSummary()
    }