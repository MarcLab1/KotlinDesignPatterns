package structural

fun main()
{
    val client : Client = Client()
    client.target.request()
}

class Client{
    val target : ITarget = Adapter(Adaptee())
}

interface ITarget{
    fun request() : Unit
}

class Adapter constructor(
    private val adaptee: Adaptee,
): ITarget{

    override fun request() : Unit {
       adaptee.specificRequest()
    }
}

class Adaptee{
    fun specificRequest() {}
}