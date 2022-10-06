package misc

fun main() {
    println(Something2().doSomething())
}

fun openFile(): String {
    return "global"
}

class Something2() {
    fun openFile() : String {
        return "class"
    }

    fun doSomething() : String {
        return misc.openFile()
    }
}