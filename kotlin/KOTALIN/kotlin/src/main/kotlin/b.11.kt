//Kotlin Program to Remove All Whitespaces from a String
fun main() {
    var str="   vasoya prince"
    println("${str.filter { !it.isWhitespace() }}")
}