//Kotlin Program to Find G.C.D Using Recursion
package function

fun main() {
    val n1 = 200
    val n2 = 20
    val hcf = hcf(n1, n2)

    println("G.C.D of $n1 and $n2 is $hcf.")
}

fun hcf(n1: Int, n2: Int): Int {
    if (n2 != 0)
        return hcf(n2, n1 % n2)
    else
        return n1
}
