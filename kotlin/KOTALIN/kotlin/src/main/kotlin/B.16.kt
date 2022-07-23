//Kotlin Program to Count Number of Digits in an Integer
fun main() {
  println("enter the num :")
  var num= readLine()!!.toInt()
 // print("${num.toString().length}")

  var count=0
  while (num !=0){
    num/=10
    count++
  }
  println("length :$count")
}