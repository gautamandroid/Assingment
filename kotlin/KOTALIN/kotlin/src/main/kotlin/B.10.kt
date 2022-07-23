// Program to Display FibonacciSeries
fun main() {
    var fact=1

    print("enter the number :")
    var num= readLine()!!.toInt()
    for(i in 1..num){
        fact=fact*i
    }
    println("fibonaci series : $fact")
}