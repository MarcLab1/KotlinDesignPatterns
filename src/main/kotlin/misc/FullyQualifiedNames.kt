package misc

fun main() {
    println(Something().doSomething())
}

fun openFile(): String {
    return "global"
}

class Something() {
    fun openFile() : String {
        return "class"
    }

    fun doSomething() : String {
        return misc.openFile()
    }
}