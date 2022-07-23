package collection

fun main() {
    val data= mapOf<Int,String>(
        101 to "prince",
        102 to "shyam",
        103 to "jay"
    )
    println(" list :${data.entries}")
    println("keys :${data.keys}")
    println(" size : ${data.size}")

    val data1= mutableSetOf<String>("prince","vasoya","shyam")
    println(" list :${data1.size}")
    println("add  :${data1.add("jay")}")
    println(" size : ${data1.size}")
    val iterator=data1.iterator()
    while(iterator.hasNext()) {
        println("${iterator.next()}")
    }


}
