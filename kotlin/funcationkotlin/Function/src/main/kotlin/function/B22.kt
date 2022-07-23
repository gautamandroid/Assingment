//WAP to filter array of strings. Print only strings which length not even.
// Create two function one for length of string second for check not even.
// Use composition function concept.(compositionfunction)

/*
fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C
{
    return { x -> f(g(x)) }
}

fun isOdd(x: Int) = x % 2 != 0

fun main()
{
    fun length(s: String) = s.length


    val oddLength = compose(::isOdd, ::length)
    val strings = listOf("a", "ab", "abc")

    println(strings.filter(oddLength))
}
*/
fun stringlength(str:String):Int=str.length
fun checkEvenOdd(value :Int):String=if(value%2==0)"Even" else "odd"
fun compose(
    len :(String)->Int,
    evenodd :(Int)->String
):(String)-> String={
    str->evenodd(len(str))
}
val string:(String)->String=compose(::stringlength,::checkEvenOdd)

fun main() {
    println(string("vasoya prince"))
}
