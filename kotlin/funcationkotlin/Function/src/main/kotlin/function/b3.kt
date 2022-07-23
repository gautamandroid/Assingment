 //WAP to multiply two number with validation if number if not null. (not null)
fun multiply(){
     print("enter the no1 :")
   var no1= readLine()!!.toInt()
    print("enter the no2 :")
    var no2= readLine()!!.toInt()
    if(no1>0&&no2>0)
    {
        var mul=no1*no2
        println("multiply number is $mul")
    }

}
fun main() {
    multiply()
}