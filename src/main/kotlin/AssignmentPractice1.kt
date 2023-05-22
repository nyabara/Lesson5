import java.util.*

class AssignmentPractice1 {
    var age = 0
    val ticketPriceLess12Yr = 15.0
    val ticketPriceBtn13And60 = 30.0
    val seniorTicketPrice = 20.0


    fun calculateTicketPrice(age: Int): String {
        var ticketPrice = ""
        if (age < 0) {
            val result = "The price is invalid"
            return result
        } else if (age > 0 && age <= 12) {
            ticketPrice = "Children Ticket price costs $ticketPriceLess12Yr.toString()"
        } else if (age > 12 && age <= 60) {

            ticketPrice = "Senior Ticket price costs ${ticketPriceBtn13And60.toString()}"
        } else if (age > 60 && age <= 100) {
            ticketPrice = "Senior Ticket price costs ${seniorTicketPrice.toString()}"

        } else {
            ticketPrice = "The price is invalid"
        }
        return ticketPrice

    }

    fun calculateTemperatureScale(temperature: Double, symbol: String): String {
        var celsiusToFahrenheit = 0.0
        var kelvinToCelsius = 0.0
        var fahrenheitToKelvin = 0.0
        var result = ""
        when (symbol.toUpperCase()) {
            "K" -> {
                val c = temperature - 273.15
                kelvinToCelsius = c
                val f = (1.8 * (c)) + 32
                celsiusToFahrenheit = f
                val k = (0.556 * (f - 32)) + 273.15
                fahrenheitToKelvin = k
                result = "KelvinToCelsius is: ${kelvinToCelsius.toString()} " +
                        "CelsiusToFahrenheit is: ${celsiusToFahrenheit.toString()} " +
                        "FahrenheitToKelvin is: ${fahrenheitToKelvin.toString()} "
            }

            "C" -> {
                val f = (1.8 * temperature) + (32)
                celsiusToFahrenheit = f
                val k = (0.556 * (f - 32)) + 273.15
                fahrenheitToKelvin = k
                val c = k - 273.15
                kelvinToCelsius = c
                result = "KelvinToCelsius is: ${kelvinToCelsius.toString()} " +
                        "CelsiusToFahrenheit is: ${celsiusToFahrenheit.toString()} " +
                        "FahrenheitToKelvin is: ${fahrenheitToKelvin.toString()} "
            }

            "F" -> {
                val k = (0.556 * (temperature - 32)) + 273.15
                fahrenheitToKelvin = k
                val c = k - 273.15
                kelvinToCelsius = c
                val f = (1.8 * (c)) + 32
                celsiusToFahrenheit = f
                result = "KelvinToCelsius is: ${kelvinToCelsius.toString()} " +
                        "CelsiusToFahrenheit is: ${celsiusToFahrenheit.toString()} " +
                        "FahrenheitToKelvin is: ${fahrenheitToKelvin.toString()} "
            }
            else -> println("Invalid choice")

        }

        return result

    }


    fun printElementsStartsWithS(): String {
        val array = arrayOf(
            "Sweet", "Peter", "Deep", "Salt", "Pepper", "Corn", "Swallow", "Lead",
            "Smart"
        )
        val arrayOfS = arrayListOf<String>()
        for (element in array) {
            if (element[0] == 'S') {
                arrayOfS.add(element)
            }
        }
        return arrayOfS.toString()
    }


}


