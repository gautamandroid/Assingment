//Kotlin Program to Find the Largest Among Three Numbers
fun main() {
     var intdata = intArrayOf(10,20,30)
    var max=intdata[0]
    for(value in intdata){
        if(value>max){
            max=value
        }
        println("no :$max")

    }
    println("max:${intdata.maxOrNull()}")
}