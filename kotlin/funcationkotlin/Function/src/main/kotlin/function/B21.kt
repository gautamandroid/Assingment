//WAP to filter array with even numbers only(Reference to function, use ::operator)
fun isEven(x: Int) = x % 2 == 0

fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    //println(numbers.filter(::isEven))
    for(i in numbers){
        if (i%2==0) {
            //println(isEven(numbers[i]))
            println("even value =$i")
        }
     }
}