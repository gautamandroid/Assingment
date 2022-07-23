//Kotlin Program to Find Factorial of a Number Using
//Recursion
package function

fun main() {
    print("enter the num :")
    val num = readLine()!!.toInt()
    val factorial = multiplyNumbers(num)
    println("Factorial of $num = $factorial")
}

fun multiplyNumbers(num: Int): Long {
    if (num >= 1)
        return num * multiplyNumbers(num - 1)
    else
        return 1
}