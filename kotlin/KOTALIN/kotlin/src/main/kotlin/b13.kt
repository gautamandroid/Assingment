//  Kotlin Program to Check if a String is Empty orNul
fun main() {
    print("enter the number :")
    var str= readLine()!!
    if(str==null ||str.length==0){
        print("String is Empty orNul")
    }
}