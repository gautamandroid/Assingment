//Kotlin Program to Join Two Lists
package collection

fun main() {
    var data= listOf<String>("iphone","nokia","mi")
    var data1= listOf<String>("realme","oneplus")

    var join= listOf<String>("$data","$data1")

    println("two list join : $join ")
}