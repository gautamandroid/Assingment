val lazyValue:String by lazy {
    println("good moring!!");
    "good night !!"


}
fun main(){
    println(lazyValue)
    println(lazyValue)
}