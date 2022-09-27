package misc

fun main()
{

    val pair1 = 1 to "one"
    val (number, name) = pair1

    println(number)
    println(name)

    val list1 = listOf<Int>(1,2,3,4,45)
    val (first, second, third) = list1

    val p1 = Person("MLab1", 99)
    val (name1, age1) = p1
}
