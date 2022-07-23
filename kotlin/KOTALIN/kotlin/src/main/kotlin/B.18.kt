import java.util.*

//Kotlin Program to Calculate the Power of aNumber
 fun main() {
   print("enter the base value :")
   var base= readLine()!!.toInt()
   print("enter the exponent value : ")
   var ex= readLine()!!.toInt()
   var result: Long=1

   while(ex>0){
       result=result*base.toLong()
       ex--
   }
    println("power of the number : $result")
}
/*
fun main() {
    print("enter the base value :")
   var base= readLine()!!.toInt()
   print("enter the exponent value : ")
   var ex= readLine()!!.toInt()
  var result = Math.pow(base.toDouble(),ex.toDouble())
    print("power of the number :$result")
}*/
