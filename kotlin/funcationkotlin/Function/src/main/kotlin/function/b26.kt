//WAP to convert following 4 function to 1 function using
//default arguments in kotlin.
package function

fun add( a:Int=10,b:Int=10){
    var sum=a+b
    println("sum = $sum")
}
fun mul(a:Int=10,b:Int=10){
    var mul=a*b
    println("mul=$mul")
}
fun div(a:Int=10,b:Int=10){
    var div=a/b
    println("div=$div")
}

fun main() {
  // add(12,23)
  sum()
}

