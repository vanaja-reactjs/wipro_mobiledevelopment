class EventManager(private val display: Display)
{
    fun addEvent(eventName: String,eventDescription: String,eventDate: String ){
        display.showEventDetails(eventName,eventDescription, eventDate)
    }
}
fun main(){
    val consoleDisplay=ConsoleDisplay()
    val eventManager=EventManager(consoleDisplay)
    eventManager.addEvent("Birthday party"," DJ swamy birthday celebrations","30-07-2024")
    eventManager.addEvent("marriage event","celebration of balaram and rani marriage","24-11-2024")

}