data class person1(var name :String ,var age :Int,var city :String){
    fun moveto(newcity:String){
        city= newcity
    }
    fun inrementage(){
        age++
    }
}
fun main() {
    println("with funcation")
    with(person1("prince", 19, "surat")) {
        println(this)
        this.moveto("canda")
        this.inrementage()
        println(this)
    }
}