package dataflow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.coroutines.CoroutineContext

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    val flow1 = flow<Int> {
        emit(1)
        emit(2)
    }

    val flow2 = flowOf(99, 44)

    val scope0 : CoroutineContext = GlobalScope.coroutineContext
    GlobalScope.launch {
        flow2
            .flowOn(scope0)
            .collectLatest {
                println(it)
            }
    }

    Thread.sleep(1000L)



}