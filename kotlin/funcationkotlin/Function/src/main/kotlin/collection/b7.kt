//Kotlin Program to Sort a Map By Values
package collection

fun main(args: Array<String>) {

    var capitals = hashMapOf<Int, String>()
    capitals.put(101, "prince")
    capitals.put(102, "shyam")
    capitals.put(103, "pal")

    //print("value : ${capitals.values}")
    val result = capitals.toList().sortedBy { (_, value) -> value}.toMap()

    for (entry in result) {
        print("Roll no: " + entry.key)
        println(" Name: " + entry.value)
    }
    //print("${capitals.toList().sortedBy{(_,value)->value}.toMap()}")
}