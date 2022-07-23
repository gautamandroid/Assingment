//Kotlin Program to Display Prime Numbers Between Two Intervals
fun main() {
    println("enter the number 1 :")
    var num1= readLine()!!.toInt()
    println("enter the number 2 :")
    var num2= readLine()!!.toInt()

    while (num1<num2) {
        var flage=0

        for (i in 2..num1/2) {
            if (num1 % i == 0) {
                flage=1
            }
        }
        if (flage == 0)

            println("$num1")
            num1++

    }
}