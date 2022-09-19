package creational

fun main() {
    val team = Team2("Toronto", "Maple Leafs", 1917)
    print(team.toString2())
}

data class Team2(val city: String = "", val name: String = "", val est: Int = 2022)

fun Team2.toString2() : String {
    return "The $city $name were established in $est"
}