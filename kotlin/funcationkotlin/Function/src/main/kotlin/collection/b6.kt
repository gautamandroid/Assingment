//Kotlin Program to Convert Array to Set (HashSet) and Vice-Versa
package collection

import java.util.*
import kotlin.collections.HashSet

fun main() {
    var array= arrayOf("prince","shyam","pal")
    val set = HashSet(Arrays.asList(*array))
    print("$set")
}