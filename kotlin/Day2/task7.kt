import java.time.LocalDate

fun main() {
    val transactions = listOf(
        Trasaction2(1, 100.0, LocalDate.of(2024, 7, 15), "Food"),
        Trasaction2(2, 50.0, LocalDate.of(2024, 7, 14), "Entertainment"),
        Trasaction2(3, 80.0, LocalDate.of(2024, 7, 16), "Utilities"),
        Trasaction2(4, 120.0, LocalDate.of(2024, 7, 14), "Food"),
        Trasaction2(5, 60.0, LocalDate.of(2024, 7, 15), "Entertainment")
    )
    fun filterAndSortTransactions(
        transactions: List<Trasaction2>,
        predicate: (Trasaction2) -> Boolean,
        comparator: Comparator<Trasaction2>
    ): List<Trasaction2> {
        return transactions
            .filter(predicate)
            .sortedWith(comparator)
    }

    val filterByDate: (Trasaction2) -> Boolean = { transaction ->
        transaction.date == LocalDate.of(2024, 7, 15) // Example date filter (July 15, 2024)
    }

    val filterByAmountGreaterThan: (Trasaction2) -> Boolean = { transaction ->
        transaction.amount > 80.0
    }

    val sortByDateAsc: Comparator<Trasaction2> = compareBy { it.date }

    val sortByAmountDesc: Comparator<Trasaction2> = compareByDescending { it.amount }

    val filteredAndSortedByDate = filterAndSortTransactions(transactions, filterByDate, sortByDateAsc)

    println("Transactions filtered and sorted by date (ascending):")
    filteredAndSortedByDate.forEach {
        println(it) }
    println()

    val filteredAndSortedByAmount = filterAndSortTransactions(transactions, filterByAmountGreaterThan, sortByAmountDesc)

    println("Transactions filtered and sorted by amount (descending):")
    filteredAndSortedByAmount.forEach { println(it) }
}