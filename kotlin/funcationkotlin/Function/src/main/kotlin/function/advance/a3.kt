package function.advance

/*Pass a lambda to any function to check if thecollection
contains an even number. The function any gets a predicate
as an argument and returns true if there is at least one
element satisfying the predicate. (Advanced)*/

fun main() {
   val number1:MutableList<Int> = mutableListOf(1,2,3)
    println(contianEvan(number1))

    val number2:MutableList<Int> = mutableListOf(1,4,5)
}
fun contianEvan(collection: Collection<Int>)= mutableListOf(1,2,3)