//Write simple function name start() return the string “OK” (basic function)
fun start():String{
    print("enter the name :")
    var name= readLine()!!
    println("name : $name")
    return name
}
fun main() {
    start()

}