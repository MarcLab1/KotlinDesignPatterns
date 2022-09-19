package misc

class Testing{

    val lazyList: MutableList<String> by lazy {
        mutableListOf("1")
    }

    val snowmanBill : Snowman by lazy {
        Snowman()
    }
}

class Snowman{
    val name : String = "Bill"
}