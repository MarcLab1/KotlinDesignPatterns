package threads

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

fun main(){

   GlobalScope.launch{
       task2()
   }
    task1()

}

fun task1() = print("hello")
suspend fun task2() = print(" world")

