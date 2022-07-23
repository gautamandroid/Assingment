// Kotlin Program to Check Whether a Numberis Palindrome or Not
fun main() {
    print("enter the num :")
    var num= readLine()!!.toInt()
    var realnum=num
    var rev=0
    while (num>0){
        val rem=num%10
        rev=rev*10+rem
        num/=10

    }
    if(realnum==rev){
        println("number is palindrom")
    }else{
        println("number is not palindrom")
    }
}