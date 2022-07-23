

class mythread2:Runnable{
    val thread :Thread= Thread(this)
    override fun run() {
        for(i in 1..10){
            println("${thread.name}..i=$i")
            Thread.sleep(1000)
        }
    }
}
fun main() {
    val thread:Thread= Thread.currentThread()
    println("name : ${thread.name}")
    val t1=mythread2()
    t1.thread.start()
    //t1.thread.join()
}