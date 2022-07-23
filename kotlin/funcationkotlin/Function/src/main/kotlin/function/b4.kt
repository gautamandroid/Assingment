//Kotlin Program to Display Prime Numbers Between Intervals Using Function
/*
fun rang() {
    var data = IntArray(5)
    for (index in data.indices) {
        print("enter the index :")
        data[index] = readLine()!!.toInt()

    }
    for (index in 2..data.indices) {
        if (data[index]/2==0){
            println("prime number is ")
        }
    }
}
fun main() {
    rang()
}*/
fun main(args: Array<String>) {
    var low = 20
    val high = 50

    while (low < high) {
        if (checkPrimeNumber(low))
            print(low.toString() + " ")

        ++low
    }
}

fun checkPrimeNumber(num: Int): Boolean {
    var flag = true

    for (i in 2..num / 2) {

        if (num % i == 0) {
            flag = false
            break
        }
    }
    return flag
}