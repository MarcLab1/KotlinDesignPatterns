package misc

data class Person(var name: String, var age: Int)

fun main() {
    var p1: Person? = Person("Danny", 55)
    p1?.age = 44
    println(p1)

    p1?.apply {
        name = "Billy"
        age = 33
        this
    }

    println(p1)

    p1.let {
        it!!.name = "Kelly"
        it!!.age = 919
    }
    println(p1)

    val list: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    list.map {
        (it * 2).also {
            println(it + 100)
        }
    }
}