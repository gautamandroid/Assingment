//Kotlin Program to Find LCM of twoNumbers
fun main() {
    print("enter the one number :")
    var a= readLine()!!.toInt()
    print("enter the scond number :")
    var b= readLine()!!.toInt()

    var GCD=1
    var i=1
    while (i <= a && i <= b){
        if(a%i==0&&b%i==0)
        GCD=i
        i++
    }
    var LCM=a*b/GCD
    println("LCM : $LCM")
}
