//. Kotlin Program to calculate the power using recursion
package function

fun main() {
    print("enter the base :")
    val base = readLine()!!.toInt()
    print("enter the powerraised :")
    val powerRaised = readLine()!!.toInt()

    val result = power(base, powerRaised)

    println("$base^$powerRaised = $result")
}

fun power(base: Int, powerRaised: Int): Int {
    if (powerRaised != 0)
        return base * power(base, powerRaised - 1)
    else
        return 1
}

