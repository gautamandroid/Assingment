data class person(var name :String ,var age :Int,var city :String){
     fun moveto(newcity:String){
        city= newcity
    }
    fun inrementage(){
        age++
    }
}
fun main() {
    println("run funcation")
      person ("prince",19,"surat").run{
          println(this)
          this.moveto("canda")
          this.inrementage()
          println(this)
      }
    println("let funcation")
    person ("prince",19,"surat").let {
        println(it)
        it.moveto("canda")
        it.inrementage()
        println(it)
    }

}