package threads

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.coroutineContext

fun main()
{

    val scope = CoroutineScope(CoroutineName("Francis"))

    scope.launch {
        println("gogogog")

        launch {
            println("team!")
        }
    }
    Thread.sleep(1000L)
}