//Kotlin Program to Display Factors of a Number
fun main(){
    println("enter the number :")
    var num= readLine()!!.toInt()
    for(i in 1..num){
        if(num %i==0){
            println("$i")
        }
    }
}