//Kotlin Program to Check ArmstrongNumber
fun main() {
    println("enter the number :")
    val num = readLine()!!.toInt()
    var orno:Int
    var rem:Int
    var result=0
    var n=0
    orno=num
    while (orno !=0){
        orno/=10
        n++
    }
    orno=num
    while (orno!=0){
        rem=orno%10
        result+=Math.pow(rem.toDouble(),n.toDouble()).toInt()
        orno/=10
    }
    if(result==num){
        println("$num is an armstrong number ")
    }
    else{
        println("$num is not  an armstrong number ")
    }
}