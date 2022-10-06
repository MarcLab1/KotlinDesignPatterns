package misc


fun main()
{
    val x = GetSomethingUseCase().invoke()
    println(x)
}

class GetSomethingUseCase() {

   operator fun invoke() : Something
    {
        return Something("1", 1)
    }
}

data class Something(val name : String, val number : Int)