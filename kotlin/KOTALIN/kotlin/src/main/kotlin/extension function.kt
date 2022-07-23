fun String.add(vararg str :String): String {
    var result="$this"
    for(s in str){
        result +="$s"
    }
    return result
}
fun main() {
    var str1="hallo"
    var result=str1.add( "how","are","your")
    println("$result")
}