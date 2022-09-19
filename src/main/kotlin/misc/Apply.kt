package misc

fun main()
{
    val f1 = Friend().apply {
        name = "Bond"
        age = 99
        nickName = "007"
    }

    //run won't return the object
    val f2 = Friend().run {
        name = "Bond"
        age = 99
        nickName = "007"
       // this
    }

    val f3 = with(Friend())
    {
        name = "Brad"
        age = 88
        this
    }


}

data class Friend(var name : String="", var age: Int=0, var nickName: String="")