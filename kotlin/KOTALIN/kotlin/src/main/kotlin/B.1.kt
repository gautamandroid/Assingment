//WAP to print all command line argument using while and do…while loop
fun main() {
    var i=1
    var j=1
    do{
        println("enter the name :")
        var a= readLine()!!
        println("name : $a")
        i++
    }while (i<=3)

    while (j<=3){
        println("enter the age :")
        var b= readLine()!!.toInt()
        println("age : $b")
        j++
    }
}