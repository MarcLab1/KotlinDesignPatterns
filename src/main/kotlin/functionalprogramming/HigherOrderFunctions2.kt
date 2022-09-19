package functionalprogramming

fun main() {
    val multiplyFunction = generateMultiply()
    println(mathIsFun(5, 6, multiplyFunction))
    println(
        mathIsFun(7, 8) { p, q ->
            p * q
        })

    println(
        mathIsFun(22, 0)
        { p, q ->
            p + q
        })
}

