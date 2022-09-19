package creational

fun main() {
    val team1 = Team.Builder().city("Toronto").name("Maple Leafs").est(1917).build()
    print(team1.toString())
}

class Team private constructor(
    val city: String,
    val name: String,
    val est: Int,
) {
    class Builder {

        private var city: String = ""
        private var name: String = ""
        private var est: Int = 2022

        fun city(value: String) = apply { city = value }
        fun name(value: String) = apply { name = value }
        fun est(value: Int) = apply { est = value }

        fun build() = Team(city, name, est)
    }

    override fun toString(): String {
        return "The $city $name were established in $est"
    }
}