class EventManager1 {
    private val listeners = mutableListOf<(String, String, String) -> Unit>()
    fun subscribe(listener: (String, String, String) -> Unit) {
        listeners.add(listener)
    }
    fun addEvent(eventName: String, eventDescription: String, eventDate: String) {

        listeners.forEach { listener ->
            listener(eventName, eventDescription, eventDate)
        }
    }
}
fun main() {
    val eventManager = EventManager1()
    eventManager.subscribe { eventName, eventDescription, eventDate ->
        println("Notification: New event added - $eventName on $eventDate")
        println("Description: $eventDescription")
        println("---------------------------------------")
    }
    eventManager.addEvent("Birthday Party", "Swamy's birthday celebration", "2024-07-19")
    eventManager.addEvent("marriage event","celebration of balaram and rani marriage","24-11-2024")


}