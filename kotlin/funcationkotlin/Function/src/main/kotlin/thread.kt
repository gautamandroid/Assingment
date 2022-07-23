//by inheriting thread class
class mythread :Thread(){
    override fun run() {
        super.run()
        for(i in 1..10){
            println("$name...i=$i")
            sleep(1000)
        }
    }
}

fun main() {
    val t:Thread= Thread.currentThread()
    println("total : ${Thread.activeCount()} ")
    val t1=mythread()
    val t2=mythread()
    t1.name="one"
    t2.name="two"
    t1.start()
    t2.start()
}