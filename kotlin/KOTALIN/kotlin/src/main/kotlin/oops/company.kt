package oops

class company {
    var name=""
    init {
        println("Init name : $name")
    }
}

fun main() {
    val company=company()
    company.name="prince"
    println("company name: ${company.name}")
}