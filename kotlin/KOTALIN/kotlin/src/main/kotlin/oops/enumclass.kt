
package oops

enum class mycolor(private val value:String) {
    RED("red"),GREEN("green"),BLUE("blue");
    fun getcolorvalue()=value
}

fun main() {
    val c1:mycolor=mycolor.BLUE

    println(c1.name)
    println(c1.ordinal)
    println(c1.getcolorvalue())
    when(c1){
        mycolor.RED-> println("it is red")
        mycolor.BLUE-> println("it is blue")
        mycolor.GREEN-> println("it is green")
    }
}

/*
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

     TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

fun main() {
    var enum:ProtocolState=ProtocolState.TALKING
    println("$enum")
    var enum1:ProtocolState=ProtocolState.WAITING
    println("$enum1")
}*/
