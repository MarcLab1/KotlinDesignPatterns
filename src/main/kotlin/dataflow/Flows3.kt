package dataflow

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

fun main() {
    val scope = CoroutineScope(CoroutineName("lala"))
    scope.launch {
        val flow1: Flow<Int> = flow {
            repeat(5)
            {
                println("$it emitted")
                delay(1000L)
                emit(it)

            }
        }
        launch {
            flow1.collect {
                println("$it collected")
            }
        }
        delay(1000L)
        launch {
            flow1.collect {
                    println("$it collected again")
            }
        }
    }

    Thread.sleep(10000L)
}