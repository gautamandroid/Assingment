data class person2(var name:String,var age :Int,var city :String){
    fun move(newcity: String){
        city=newcity
    }
    fun inratege(){
        age++
    }
}
fun main() {

     var p=person("prince",18,"surat").apply{
         age=18
         city="london"
     }
    println(p)

}