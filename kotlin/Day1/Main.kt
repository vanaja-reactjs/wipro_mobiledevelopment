import java.util.*


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Example transactions
    val transaction1 = Transaction(100.0, date = Date(), "movie")
    val transaction2 = Transaction(50.0, date=Date(), "Grocery")
    val transaction3 = Transaction(80.0, date=Date(), "Utilities")

    // Categorize transactions using when statement
    println("Categorizing transactions:")
    categorizeTransaction(transaction1)
    categorizeTransaction(transaction2)
    categorizeTransaction(transaction3)
}
fun categorizeTransaction(transaction: Transaction) {
    when (transaction.category) {
        "movie" -> println("Transaction of Amount ${transaction.amount} spent on the Date ${transaction.date} at Movie Theater .")
        "Grocery" -> println("Transaction of Amount ${transaction.amount} spent on the Date ${transaction.date} at Grocery")
        "Utilities" -> println("Transaction of Amount ${transaction.amount} spent on  the Date${transaction.date} on Utilities.")
        else -> println("${transaction.amount} spent on Other category.")
    }
}