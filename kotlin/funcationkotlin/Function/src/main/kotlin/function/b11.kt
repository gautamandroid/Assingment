//Kotlin Program to Convert Octal Number to Decimal
//and vice-versa
package function

fun convertDecimalToOctal(decimal: Int): Int {
    var decimal = decimal
    var octalNumber = 0
    var i = 1

    while (decimal != 0) {
        octalNumber += decimal % 8 * i
        decimal /= 8
        i *= 10
    }

    return octalNumber
}
fun main() {
    val decimal = 58
    val octal = convertDecimalToOctal(decimal)
    println("$decimal in decimal = $octal in octal")
}




