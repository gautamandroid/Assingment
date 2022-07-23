//. Kotlin Program to Reverse aNumber
fun main() {
    print("enter the number :")
    var num= readLine()!!.toInt()
    var rem=0
    while (num>0){
        var rev=num%10
        rem=rem*10+rev
        num/=10
    }
    println("revarse number : $rem")
}