package oops

interface  firstinterface {
    fun funfast()
}
interface secondinterface:firstinterface{

}
class emp1:secondinterface{
    override fun funfast()
    {
        println("first funcation")
    }
}

fun main() {
    var emp= emp1()
    emp.funfast()
}