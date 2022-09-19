package structural

//tree like object structure
interface Worker{
    val name : String
    val age : Int
    fun getData() : String
}

class Manager (override val name : String, override val age: Int) : Worker
{
    override fun getData(): String = "Manager $name is $age years old"
}

class Developer (override val name : String, override val age: Int) : Worker
{
    override fun getData(): String = "Developer $name is $age years old"
}

fun main()
{
    val workers : MutableList<Worker> = mutableListOf()
    workers.add(Manager("MLab1", 99))
    workers.add(Manager("Tony", 88))
    workers.add(Developer("Gabor", 30))
    workers.add(Developer("Adam", 31))

    for (worker in workers) {
        println(worker.getData())
    }

}