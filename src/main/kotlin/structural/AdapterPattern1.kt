package structural

class CanadaCharger {
    val chargerSpec: Int = 66
}

class EUCharger {
    val chargerSpec: Int = 99
}

class AsiaCharger {
    val chargerSpec: Int = 101
}

fun AsiaCharger.convertToCanadaCharger(): CanadaCharger {
    return CanadaCharger()
}

fun CanadaCharger.convertToEUCharger(): EUCharger {
    return EUCharger()
}

fun main() {
    val charger: AsiaCharger = AsiaCharger()
    println(charger.convertToCanadaCharger().convertToEUCharger().chargerSpec.toString())
}