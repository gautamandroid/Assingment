//WAP to find max value using function as express

    fun maxnum(){
        var a= intArrayOf(1,5,4,6,7,4,9)
        var max=a[0]
        for(i in a){
            if(max<i){
                max=i
            }
        }
        println("max number is $max")
    }

fun main(){
   maxnum()
}