//. WAP to greet user using class with primary constructor
//accepting name of user. (Class, primary constructor, greet()
//method)
package `class and object`

class data constructor(var name :String) {

    init {
        println(" name :  $name")

    }
    fun greet(){
        println(" good morning prince !!")
    }

}

fun main() {
    var data=data("prince vasoya ")
      data.greet()
}