//WAP to destructure a person object and retrieve name
//and age from it. (Destructuring Declaration)
package `class and object`

data class data1 (var name:String,var age:Int ) {
}

fun getdata1():data1{
    return  data1("vasoya prince",18)
}
fun main() {
    var obj= getdata1()
      println("name :  ${obj.name}")
      println("name :  ${obj.age}")
    var (name,age) = getdata1()
    println("name is $name")
    println("name is $age")
}

