package threads

import kotlinx.coroutines.*

fun main() {
    val scope = CoroutineScope(CoroutineName("My Scope"))

    scope.launch {
        val job1 = scope.launch {

            while (true) {
                yield()  //ensureActive()  //same as delay(50L)  //same as yield()
                println("111")
            }

        }

        val job2 = scope.launch {
            while (true) {
                yield()  //ensureActive()  //same as delay(50L)  //same as yield()
                println("2222")
            }
        }
        println("before job 1 cancel")
        job1.cancel()
        println("after job1 cancel")
        job1.join()
        println("after job1 join")

        job2.cancelAndJoin()
    }
    Thread.sleep(1000L)

}