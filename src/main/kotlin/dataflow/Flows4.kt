package dataflow

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

fun main() {
    val flow1: Flow<Int> = flow<Int> { (1..4).forEach { emit(it) } }
    val scope = CoroutineScope(CoroutineName("me"))

    val _stateFlow: MutableStateFlow<Int> = MutableStateFlow(12) //stateFlows are "hot"
    val stateFlow = _stateFlow.asStateFlow()

    scope.launch {
        stateFlow.collectLatest {
            println(it)
        }
    }
    _stateFlow.value = 33

    val _sharedFlow: MutableSharedFlow<Int> = MutableSharedFlow() //also "hot, but no initial value
    val sharedFlow = _sharedFlow.asSharedFlow()

    scope.launch {
        sharedFlow.collect {
            it
        }
    }
    scope.launch {
        sharedFlow.collect {
            it
        }
    }
    Thread.sleep(1000L)
    println("sharedFlow subs = ${_sharedFlow.subscriptionCount.value}")
    Thread.sleep(2000L)

}