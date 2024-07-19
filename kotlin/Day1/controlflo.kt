class Controlflo(val amount: Double,val date: String,val category: String)
{
    override fun toString(): String {
        return "transaction $amount on $date spent on $category"
    }
}
fun main(){
    val tran1=Controlflo(100.0,"27-06-2024","Food")
    val tran2=Controlflo(50.0,"25-06-2024","Entertainment")
    val tran3=Controlflo(350.0,"22-06-2024","Utilities")
    cateroryupdate(tran1)
    cateroryupdate(tran2)
    cateroryupdate(tran3)

}

fun cateroryupdate(tran: Controlflo)
{
    when(tran.category){
        "Food" -> println("Transaction ${tran.amount} spent on Food on the date ${tran.date} on ${tran.category}")
        "Entertainment" -> println("transaction ${tran.amount} spent on the date ${tran.date} on ${tran.category}")
        "Utilities" -> println("transaction ${tran.amount} spent on the date ${tran.date} on ${tran.category}")
        else -> println("enter valid category")
    }




}
