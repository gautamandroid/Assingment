//Kotlin Program to Find all Roots of a Quadratic Equation
fun main()
{
    println("Enter number1:")
    val no1 = readLine()!!.toDouble()

    println("Enter number2:")
    val no2 = readLine()!!.toDouble()

    println("Enter number3:")
    val no3 = readLine()!!.toDouble()

    val determinant = (no2 * no2) - (no2 * no1 * no3)
//    println("Math.sqrt($determinant)")
    var root1:Double
    var root2:Double
    var result:String

    if(determinant>0)
    {
        root1=(+no2+Math.sqrt(determinant))/(2*no1)
        root2=(-no2-Math.sqrt(determinant))/(2*no1)
        result="root1=%.2f and root2=%.2f".format(root1,root2)

    }
    else if(determinant==0.0)
    {
        root2=-no2/(2*no1)
        root1=root2
        result ="root1 = root2=%.2f;".format(root1)
        println("Roots are equal")
    }
    else{
        val realpart= -no2/(2*no1)
        val imagepart= Math.sqrt(-determinant)/(2*no1)
        result="root1=%.2f+%.2f and root2=%.2f+%.2f".format(realpart,imagepart,realpart,imagepart)
    }
    println(result)

}