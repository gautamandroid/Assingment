package oops

open class scondary(var FirstName:String,val lastName :String) {

    constructor(FirstName: String):this(FirstName,"unknown"){

    }
    constructor():this("unknown"){

    }
}

fun main() {
    var a=scondary("prince","vasoya")
    println("${a.FirstName}")
    println("${a.lastName}")

}