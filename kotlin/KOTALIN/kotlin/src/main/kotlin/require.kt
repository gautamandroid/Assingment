fun main() {
    println("enter the numbre :")
    val no1= readLine()!!.toInt()
    println("enter the numbre :")
    val no2= readLine()!!.toInt()

    require(no1>0){
        println("unvalid number")
    }
    require(no2>0){
        println("unvalid number")
    }
    var sum=no1+no2
    println("sum = $sum")
}