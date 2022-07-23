//Kotlin Program to Display FibonacciSeries
fun main() {
    var x1=0
    var x2=1
    println("enter the fibonaci number :")
    var num = readLine()!!.toInt()

    for(i in 1..num){

        val sum=x1+x2
        x1=x2
        x2=sum
        println("$x1 + $x2=$sum")
    }

}