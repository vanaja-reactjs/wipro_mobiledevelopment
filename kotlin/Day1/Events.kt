import java.time.LocalDate

data class Event(
    val name: String,
    val date: LocalDate,
    val attendeeCount: Int
)

fun main() {
    val event = Event("Birth day", LocalDate.of(2024, 8, 15), 250)
    val event2=Event("Farewall Day",LocalDate.of(2024,6,23),450)
    println("Event Name: ${event.name} Event Date ${event.date} Attendance count ${event.attendeeCount}")
    println("Event Name: ${event2.name} Event Date ${event2.date} Attendance count ${event2.attendeeCount}")
}