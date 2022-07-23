//Kotlin Program to Convert Binary Number toDecimal
//and vice-versa
package function

fun main() {
    val num: Long = 110110110
    val decimal = convertBinaryToDecimal(num)
    println("$num in binary = $decimal in decimal")
}

fun convertBinaryToDecimal(num: Long): Int {
    var num = num
    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (num.toInt() != 0) {
        remainder = num % 10
        num /= 10
        decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}

