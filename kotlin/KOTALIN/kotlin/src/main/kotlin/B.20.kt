//Kotlin Program to Check Whether a Number is Primeor Not
fun main() {
    println("enter the number :")
    var num= readLine()!!.toInt()
    var flage=0

    for(i in 2..num){
        if(num % i==0){
            flage++
        }
    }
    if(flage==1){
        println("number is prime")
    }else{
        println("number is not prime")
    }
}