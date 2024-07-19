import java.util.Date
class Transaction(val amount: Double,val date:Date,val category:String) {
    override fun toString(): String {
        return "Transaction  $amount on  $date spent on $category"
    }
}