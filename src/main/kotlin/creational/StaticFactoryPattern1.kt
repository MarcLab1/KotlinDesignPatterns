package creational

fun main() {
    Something.withNumber(3)
    Something.withNumber(4)
}

class Something(number : Int){

    init {
        println("$number has been initialized")
    }
    companion object{
        fun withNumber(number : Int) = Something(number)
    }
}