import kotlinx.coroutines.*
fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("Hello from Coroutine!") }
    println("hello from main thread")
    Thread.sleep(2000L)
}
