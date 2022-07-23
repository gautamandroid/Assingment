//Kotlin Program to Convert List (ArrayList) to Array and Vice-Versa
package collection

fun main(args: Array<String>) {


    val list: List<String> = listOf("vasoya ", "prince ", "jayshukhbhai")

    // converting arraylist to array
    val array: Array<String> = list.toTypedArray()

    // printing elements of the array
    array.forEach {
        print(it)
    }

}