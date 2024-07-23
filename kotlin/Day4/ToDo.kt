import java.util.InputMismatchException
import java.util.Scanner

data class ToDo(
    var id: Int,
    var name: String
)
class ToDoList {
    val toDoList = mutableListOf<ToDo>()

    fun add(id: Int, name: String) {
        if (name.isNotBlank()) {
            val toDo = ToDo(id, name)
            toDoList.add(toDo)
            println("Added: $toDo")
        } else {
            println("add name cannot be blank.")
        }
    }
    fun edit(id: Int, newName: String?) {
        val toDo = toDoList.find { it.id == id }
        if (toDo != null) {
            if (newName != null && newName.isNotBlank()) {
                toDo.name = newName
                println("Edited: $toDo")
            } else if (newName == null) {
                println("name is null.")
            } else {
                println("name is blank.")
            }
        } else {
            println("Task with ID $id not found.")
        }
    }

    fun delete(id: Int) {
        val toDo = toDoList.find { it.id == id }
        if (toDo != null) {
            toDoList.remove(toDo)
            println("Deleted: $toDo")
        } else {
            println("Task with ID $id not found.")
        }
    }

    fun display() {
        if (toDoList.isEmpty()) {
            println("Nothing to display.")
        } else {
            toDoList.forEach { println(it) }
        }
    }

    fun nullCheck(id: Int?) {
        if (id != null) {
            val task = toDoList.find { it.id == id }
            if (task != null) {
                println("not null")
            } else {
                println("null")
            }
        } else {
            println("ID is null.")
        }
    }

    fun handleOperation(operation: Int, id: Int = 0, name: String? = null) {
        when (operation) {
            1 -> {
                if (id > 0 && name != null) {
                    add(id, name)
                } else {
                    println("Valid ID and name are required for adding.")
                }
            }
            2 -> edit(id, name)
            3 -> delete(id)
            4 -> display()
            5 -> nullCheck(id)
            6 -> println("Exiting...")
            else -> println("Invalid operation.")
        }
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    val toDoList = ToDoList()

    while (true) {
        println("Enter operation number:")
        println("1 - Add")
        println("2 - Edit")
        println("3 - Delete")
        println("4 - Display")
        println("5 - Null Check")
        println("6 - Exit")

        try {
            val operation = sc.nextInt()
            sc.nextLine()

            if (operation == 6) break

            when (operation) {
                1 -> {
                    print("Enter ID: ")
                    val id = sc.nextInt()
                    sc.nextLine()
                    print("Enter Name: ")
                    val name = sc.nextLine()
                    toDoList.handleOperation(operation, id = id, name = name)
                }
                2 -> {
                    print("Enter ID: ")
                    val id = sc.nextInt()
                    sc.nextLine()
                    print("Enter New Name: ")
                    val name = sc.nextLine()
                    toDoList.handleOperation(operation, id = id, name = name)
                }
                3 -> {
                    print("Enter ID: ")
                    val id = sc.nextInt()
                    sc.nextLine()
                    toDoList.handleOperation(operation, id = id)
                }
                4 -> toDoList.handleOperation(operation)
                5 -> {
                    print("Enter ID to check: ")
                    val id = sc.nextInt()
                    sc.nextLine()
                    toDoList.handleOperation(operation, id = id)
                }
                else -> println("Invalid operation.")
            }
        } catch (e: InputMismatchException) {
            println("Invalid input. Please enter a number.")
            sc.nextLine()
        }
    }
}