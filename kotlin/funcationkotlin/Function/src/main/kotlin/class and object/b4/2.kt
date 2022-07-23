package `class and object`.b4

//string()

data class User(val name: String, val age: Int)

fun main() {
    val a = User("vasoya prince", 18)
    println(a.toString())
}