package functionalprogramming

fun main() {
    val multiplyFunction = generateMultiply()
    println(multiplyFunction(2,3))

    println(mathIsFun(3, 4, multiplyFunction))

}

fun generateMultiply(): (Int, Int) -> Int {
    return fun(x: Int, y: Int): Int {
        return x * y
    }
}

fun mathIsFun(x: Int, y: Int, doSomething:(Int,Int) -> Int) : Int
{
    return doSomething(x,y)
}
