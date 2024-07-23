import java.time.LocalDate

class TransactionList {
    private val transactions = mutableListOf<Trasaction2>()
    private var nextId = 1

fun addTransaction(amount: Double, date: LocalDate, category: String) {
    val newTransaction = Trasaction2(nextId, amount, date, category)
    transactions.add(newTransaction)
    nextId++
}
fun deleteTransaction(transactionId: Int): Boolean {
    val iterator = transactions.iterator()
    while (iterator.hasNext()) {
        val transaction = iterator.next()
        if (transaction.id == transactionId) {
            iterator.remove()
            return true
        }
    }
    return false
}
    fun editTransaction(transactionId: Int, amount: Double, date: LocalDate, category: String): Boolean {
        for (transaction in transactions) {
            if (transaction.id == transactionId) {
                transaction.amount = amount
                transaction.date = date
                transaction.category = category
                return true
            }
        }
        return false
    }
    fun printTransactions() {
        for (transaction in transactions) {
            println("Transaction ID: ${transaction.id}, Amount: ${transaction.amount}, Date: ${transaction.date}, Category: ${transaction.category}")
        }
    }
}

fun main() {
    val transactionList = TransactionList()
    transactionList.addTransaction(100.0, LocalDate.of(2024, 7, 18), "Food")
    transactionList.addTransaction(50.0, LocalDate.of(2024, 7, 17), "Entertainment")
    transactionList.addTransaction(80.0, LocalDate.of(2024, 7, 16), "Utilities")

    println("Initial Transactions:")
    transactionList.printTransactions()

    println("\nEditing transaction with ID 2...")
    transactionList.editTransaction(2, 75.0, LocalDate.of(2024, 7, 17), "Entertainment")

    println("\nUpdated Transactions:")
    transactionList.printTransactions()
    println("\nDeleting transaction with ID 1...")
    transactionList.deleteTransaction(1)
    println("\nTransactions after deletion:")
    transactionList.printTransactions()
}
