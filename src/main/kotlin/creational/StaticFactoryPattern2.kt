package creational

fun main() {
    //Server(3434)  --private constructor, this won't work
    Server.startServer(1234)
}

class Server private constructor(number: Int) {
    init {
        println("Started server number $number")
    }

    //a class may have only 1 companion object
    companion object {
        fun startServer(number: Int): Server {
            return Server(number)
        }
    }
}