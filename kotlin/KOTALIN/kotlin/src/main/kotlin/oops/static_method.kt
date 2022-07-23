package oops

sealed class person1  {
    var Fristname:String=""
    companion object{
        var count=10
        fun showcount(){
            println("count :$count")
        }
    }
}
/*class doctor : person1(){

}*/
fun main(){
    println("count : ${person1.count}")
    person1.showcount()
  /*  var per=person1
    println("${per.count}")
    println("${per.showcount()}")*/
}