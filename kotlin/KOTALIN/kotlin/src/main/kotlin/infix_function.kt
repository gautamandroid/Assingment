infix fun Int.greter(num:Int) = if(this>num) this else num

fun main() {
    val no1 =1000
    val no2 =200

    val max = no1 greter no2
    println("max : $max")

}