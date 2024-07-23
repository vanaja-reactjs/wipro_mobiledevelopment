class ConsoleDisplay : Display {
    override fun showEventDetails(eventName: String, eventDescription: String, eventDate: String) {
        println("Event : $eventName")
        println("Date: $eventDate")
        println("Description: $eventDescription")
        println("-----------------------")
    }
}