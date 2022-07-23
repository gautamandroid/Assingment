package oops.inhritance

open class company (var firstName :String,var lastName :String){
/*
    constructor(firstName:String):this("",""){

    }*/
    override fun toString(): String {
        return " company(firstName='$firstName',lastName='$lastName') "

    }
}
class emp():company("unknown","unknown"){
    var salary:Int=0
    constructor(salary:Int):this(){
        this.salary=salary
    }
    fun display(){
        println("""
            fristName : $firstName
            lastName : $lastName
            salary : $salary
        """.trimIndent())
    }
}

fun main() {
    val emp=emp()
    emp.firstName="prince"
    emp.lastName="vasoya"
    emp.salary=1000000
    emp.display()
}