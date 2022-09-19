package creational

class UselessClass{

    companion object MyThing{

        val name : String = "MLab1"
        var mutableName : String = "Start"

        fun getData() : String
        {
            return "does nothing useful"
        }
    }
}

fun main()
{
    println(UselessClass.getData())
    println(UselessClass.name)
    println(UselessClass.mutableName)
    UselessClass.mutableName = "Finish"
    println(UselessClass.mutableName)
}