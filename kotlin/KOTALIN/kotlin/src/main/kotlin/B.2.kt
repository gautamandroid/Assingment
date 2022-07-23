//Read language code from command line and print “Hello” if EN , print “Salut” if FR, print “Ciao” if IT.
fun main() {
    println("choose one EN,FR,IT : ")
    var a= readLine()!!
    //var result:String
    when(a){
        "EN" -> println("hello")
        "FR"-> println("salut")
        "IT"-> println("ciao")
        else-> println("unvalid")
    }
   // println("$a")
}