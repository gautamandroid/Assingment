//Kotlin Program to Check Whether a Number is Positive or Negative
fun main()
{
    println("Enter number:")
    var no1= readLine()!!.toInt()
    if(no1>0) {
        println("$no1 is positive number:")
    }
    else if(no1<0)
    {
        println("$no1 is Negative number:")
    }
    else
    {
        println("Invalid number")
    }
}
