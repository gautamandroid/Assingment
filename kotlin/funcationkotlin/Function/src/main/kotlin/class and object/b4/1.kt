 //WAP to demonstrate example of copy(), toString(),
//equals() functions in above example. (data keyword)

package `class and object`

data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val u1 = User("prince vasoya", 19)



    // using copy function to create an object
    val u2 = u1.copy("shyam vasoya ")

    println("u1: name = ${u1.name}, name = ${u1.age}")
    println("u2: name = ${u2.name}, name = ${u2.age}")
}