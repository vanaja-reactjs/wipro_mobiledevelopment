import jdk.javadoc.internal.doclets.formats.html.markup.Table
import org.jetbrains.exposed.sql.transactions.transaction

object InventoryItems : Table(){
    val id = long("id").autoIncrement().primaryKey()
    val name = varchar("name",100)
    val description=varchar("description",255)
    val quantity= integer("quantity")
    val price= double("price")

}
class DatabaseManager{
    init{
        Database.connect("jdbc")
    }

}
