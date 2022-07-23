/*
fun main() {

 var dataInt:Array<Int> = arrayOf(10,20,30)
 var datafloat:Array<Float> =  arrayOf(10.5f,20.5f)

    printarray(dataInt)
    printarray(datafloat)
    //changevalue<Int,Float>(100,200.5f)
}

fun <T1, T2> changevalue(t: T1, u: T2)=Unit

fun<T>printarray(array: Array<T>) {
    for (value in array) {
        println(value)
    }
}
*/
class contaner<T>(var data:T){
    fun infoData(a:T){
       data=a
    }
    fun getdata():T{
        return data
        }
    }

fun main() {
    var obj=contaner<Int>(6)
    println("${obj.getdata()}")

}
