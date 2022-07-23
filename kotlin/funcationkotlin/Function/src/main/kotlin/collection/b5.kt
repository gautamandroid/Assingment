//Kotlin Program to Convert Map (HashMap) to List
package collection

import java.util.ArrayList
import java.util.HashMap

fun main(args: Array<String>) {

    val map = HashMap<Int, String>()
    map.put(1, "prince")
    map.put(2, "shyam")
    map.put(3, "jay")
    map.put(4, "pal")



    println("Key List: ${map.keys}")
    println("Value List: ${map.values}")

}