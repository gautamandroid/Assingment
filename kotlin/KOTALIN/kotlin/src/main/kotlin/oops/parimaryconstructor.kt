package oops

class parimary(var id : Int,var name:String) {
    fun displayID(){
        var a=id
        var b=name
        println("Id = $a")
        println("Name = $b")
    }
}

fun main() {
    var a=parimary(101,"prince vasoya")
    a.displayID()
}

