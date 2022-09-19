package dataflow

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectIndexed
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch


fun main()
{
    val flow1 : Flow<Int> = flow{
        (1..5).forEach {
            emit(it)
        }
    }

    GlobalScope.launch {
        flow1.collectIndexed { index, value ->
            println("$index $value")
        }
    }
    Thread.sleep(1000L)



}