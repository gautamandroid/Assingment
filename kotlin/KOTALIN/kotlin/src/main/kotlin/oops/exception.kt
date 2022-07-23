package oops

fun main() {
    try {
        Doaddition()
    }catch (ex :Exception){
        print(ex.toString())
    }
    println("main end")
}
fun Doaddition():Int{

      print("enter the no1 :")
      var no1= readLine()!!.toInt()
      print("enter the no2 :")
      var no2= readLine()!!.toInt()
      if(no1<0 || no2<0){
          fail("nagavetive numberexception")
      }

      var result=no1/no2
      //return result
      println("result : $result")

/*
    finally {
        println("\nfinally block")
    }*/
    return 0
}

fun fail(msg: String):Nothing {
    throw NegativeArraySizeException (msg)
}
