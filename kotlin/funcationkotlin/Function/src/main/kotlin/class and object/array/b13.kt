//Kotlin Program to Check if An Array Contains aGiven Value
package array

fun main() {
    var array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println("enter the Int value :")
    var a = readLine()!!.toInt()
    var found=false
    for (i in array) {

        if (i == a) {
            //print("this number is found")
            found = true
        }
    }
    if (found)
        println("$a is found.")
    else
        println("$a is not found.")
}

