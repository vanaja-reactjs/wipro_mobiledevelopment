data class Employee(
    val id: Int,
    var name: String,
    var position: String,
    var salary: Double
)

class EmployeeManagementSystem {
    private val employees = mutableListOf<Employee>()

    fun addEmployee(employee: Employee) {
        employees.add(employee)
    }
    fun removeEmployee(id: Int): Boolean {
        val employee = findEmployeeById(id)
        return if (employee != null) {
            employees.remove(employee)
            true
        } else {
            false
        }
    }

    fun findEmployeeById(id: Int): Employee? {
        return employees.find { it.id == id }
    }


    fun displayAllEmployees() {
        println("Employee List:")
        employees.forEach { println(it) }
    }

    fun updateEmployeeDetails(id: Int, name: String? = null, position: String? = null, salary: Double? = null): Boolean {
        val employee = findEmployeeById(id)
        return if (employee != null) {
            name?.let { employee.name = it }
            position?.let { employee.position = it }
            salary?.let { employee.salary = it }
            true
        } else {
            false
        }
    }
}

fun main() {
    val empSystem = EmployeeManagementSystem()
    empSystem.addEmployee(Employee(1, "swamy", "Manager", 50000.0))
    empSystem.addEmployee(Employee(2, "vanaja", "Developer", 40000.0))
    empSystem.addEmployee(Employee(3, "prasanna", "Tester", 35000.0))

    empSystem.displayAllEmployees()

    empSystem.updateEmployeeDetails(2, salary = 45000.0)

    empSystem.displayAllEmployees()

    val removed = empSystem.removeEmployee(1)
    if (removed) {
        println("Employee with ID 1 removed successfully.")
    } else {
        println("Employee with ID 1 not found.")
    }

    empSystem.displayAllEmployees()
}