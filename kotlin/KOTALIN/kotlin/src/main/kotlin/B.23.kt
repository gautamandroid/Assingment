// Kotlin Program to Display Armstrong Number Between Two Intervals
fun main() {
    print("enter the number 1 :")
    var a= readLine()!!.toInt()
    print("enrter the number 2 :")
    var b= readLine()!!.toInt()

    for (i in a..b){
        var num=i
        var sum=0
        var digit=0

        while (num!=0){
            num/=10
            digit++
        }
        num=i

        while (num!=0){
            var rem=num%10
            sum+=Math.pow(rem.toDouble(),digit.toDouble()).toInt()
            num/=10

         }
         if (sum==i){
            println("$sum")
          }
     }
 }