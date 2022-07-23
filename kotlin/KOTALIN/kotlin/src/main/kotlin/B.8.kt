//Kotlin Program to Check Whether a Character is Alphabet or Not
fun main() {
    print("enter the any thing : ")
    var num= readLine()!!
    if(num >="a"&&num<="z"||num>="A"&&num<="Z"){
        println("is a alphabet ")
    }else{
        println("is a number ")
    }
}