open class Event1(
    val name: String,
    val date: String,
    val location: String
) {
    // Properties and methods common to all events can be defined here
    override fun toString(): String {
        return "Event: $name\nDate: $date\nLocation: $location"
    }
}

// SpecialEvent subclass inheriting from Event
class SpecialEvent(
    name: String,
    date: String,
    location: String,
    val vipList: MutableList<String> = mutableListOf(),
    val premiumServices: MutableList<String> = mutableListOf()
) : Event1(name, date, location) {

    // Additional methods specific to SpecialEvent can be added here
    fun addVIP(guest: String) {
        vipList.add(guest)
    }

    fun removeVIP(guest: String) {
        vipList.remove(guest)
    }

    fun addPremiumService(service: String) {
        premiumServices.add(service)
    }

    fun removePremiumService(service: String) {
        premiumServices.remove(service)
    }

    override fun toString(): String {
        val basicInfo = super.toString()
        val vipListInfo = "VIP List: ${vipList.joinToString(", ")}"
        val premiumServicesInfo = "Premium Services: ${premiumServices.joinToString(", ")}"
        return "$basicInfo\n$vipListInfo\n$premiumServicesInfo"
    }
}

// Example usage
fun main() {
    val specialEvent = SpecialEvent("Gala Dinner", "2024-07-31", "Nova Hotel")
    specialEvent.addVIP("rohit sarma")
    specialEvent.addVIP("kohli")
    specialEvent.addPremiumService("Exclusive Unlimited buffet")
    specialEvent.addPremiumService("VIP Lounge Access")

    println(specialEvent)
}