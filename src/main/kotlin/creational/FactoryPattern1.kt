//Design patterns - Factory

fun main(args: Array<String>) {
    val canadaCurrency : String? = CurrencyFactory.currencyForCountry(Canada(""))?.currencyCode
    println(canadaCurrency)
}

sealed class Country {
    object India : Country()
}

object Spain : Country()
class Canada(val property: String) : Country()
data class USA(val property: String) : Country()

class Currency(val currencyCode: String)

object CurrencyFactory {
    fun currencyForCountry(country: Country): Currency? {
        return when (country) {
            is Spain -> Currency("Spain")
            is Canada -> Currency("Canada")
            is USA -> Currency("Usa")
            is Country.India -> Currency("Ind")
            else -> null
        }
    }
}
