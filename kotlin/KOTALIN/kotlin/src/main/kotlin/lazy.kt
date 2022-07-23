val lazyValue:String by lazy{
    println("computed !");"hello"
}
fun main() {
    println(lazyValue)
    println(lazyValue)
}