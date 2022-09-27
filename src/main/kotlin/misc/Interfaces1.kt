package misc

interface Color{
    var count : Int

    fun addToCount(amount : Int)
    {
        count += amount
    }
}

class MyColor() : Color{
    override var count: Int = 0
        set(value) {field += value}
}

fun main()
{
    val c1 : MyColor = MyColor()
    c1.addToCount(10)
    println(c1.count.toString())
    c1.count = 99
    println(c1.count.toString())
}