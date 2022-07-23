package `class and object`.b4
//equala()

data class User4(val name: String, val age: Int)

fun main(args: Array<String>) {
    val u1 = User4("prince", 19)
    val u2 = u1.copy()
    val u3 = ( "shyam")

    if (u1.equals(u2) == true)
        println("u1 is equal to u2.")
    else
        println("u1 is not equal to u2.")

    if (u1.equals(u3) == true)
        println("u1 is equal to u3.")
    else
        println("u1 is not equal to u3.")
}