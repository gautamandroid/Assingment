package collection

fun main() {
    val listof= listOf<String>("prince","jay","radhe","prince")

    for(i in listof){
        println("$i with lenght ${i.length}")
    }
    println("${listof.get(3)}")
    println("${listof.subList(1,2)}")
    println("${listof.toString()}")
    println("${listof.indexOf("prince")}")
    println("${listof.lastIndexOf("prince")}")
    println("${listof.listIterator(2)}")

}