package oops

abstract class company1 {
    abstract var name :String
    abstract fun hellocompany(depertName:String)
    //non abstract mathods
    fun hicompany(){
        print("hello massage")
    }
}
 class employee:company1(){
    override fun hellocompany(depretName: String) {
        println("depretmant name : $depretName")
    }
     override var name: String=""
}

fun main() {
    val emp=employee()
    emp.name="vasoya prince"
    println("name : ${emp.name}")
    emp.hellocompany("devaloper")
    emp.hicompany()


}