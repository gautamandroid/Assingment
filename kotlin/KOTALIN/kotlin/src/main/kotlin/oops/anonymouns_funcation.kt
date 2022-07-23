package oops

import kotlin.math.pow

fun main() {
    printseries(3){
        print("$it +")
        it
    }
    println("")
    printseries(3){
        print("$it^2+")
        it.toDouble().pow(2.0).toInt()

    }
    println(" ")
    var data = intArrayOf(10,20,30,40,50)
    var data3=data.filter {
        it%3==0
    }
    //println("${data.filter { it%3==0 }}")
     println("$data3")

}
fun printseries(range: Int,logic:(Int)->Int){
    var sum=0
    for(i in 1..range){
        sum+=logic(i)
    }
    print("\n sum:$sum")
}