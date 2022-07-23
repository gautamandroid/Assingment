package oops
data class student(val fristName:String,val lastName:String,val age:Int) {

}

fun main() {
    val s1=student("prince","vasoya",19)
    val s2=student("prince","vasoya",18)
    //println("s1 : $s1")

    if(s1==s2){
        println("equals")
    }
    else{
        println("not equals")
    }
}
