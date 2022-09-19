package dataflow

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

fun main() {

    val flow1 : Flow<Int> = flow{ (0..3).forEach { emit(it) }}
    val flow2 : Flow<Int> = flow{ (10..20).forEach { emit(it) }}

    (1..4).forEachIndexed { index, coroutineId ->

        GlobalScope.launch {

            flow1.collect {
                println("$index : $it")
            }

            launch {
                flow1.collect { print("$it ") }
            }
        }

    }
    Thread.sleep(1000L)
}