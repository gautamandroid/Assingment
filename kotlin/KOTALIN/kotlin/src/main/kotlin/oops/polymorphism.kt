package oops

open class person {
    open fun greeting(){
        println("Good Moring person")
    }
}
class emp():person(){
    override fun greeting (){
        super.greeting()
            println("Good Moring emp")
    }
}
fun main() {
    var person = person()
    person.greeting()
    println(">>>>>>>>>>>>>>>>")
    person = emp()
    person.greeting()
}