//. Kotlin Program to Make a Simple CalculatorUsing switch...case
fun main(){
    print("enter the number 1 :")
    var no1= readLine()!!.toInt()
    print("enter the number 2 :")
    var no2= readLine()!!.toInt()

    println("press 1 to + ")
    println("press 2 to - ")
    println("press 3 to / ")
    println("press 4 to % ")
    println("press 5 to * ")
    println("select number :")
    var result= readLine()!!.toInt()
    var ans:Int


    when(result){
        1 ->ans = no1 + no2
        2 -> ans = no1-no2
        3 ->ans = no1/no2
        4 -> ans = no1%no2
        5 ->ans = no1*no2
        else->{
            println("enter the correct number !!")
            return
        }

    }
    //println("$ans")
    println("ans : $ans")
}