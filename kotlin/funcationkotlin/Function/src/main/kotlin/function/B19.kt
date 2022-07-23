//WAP to demonstrate the use of observable property. (observable)
import kotlin.properties.Delegates

fun main()
{
    var observed=false
    var sum=0
    var max:Int by Delegates.observable(0){property, oldValue, newValue ->
        observed=true
        sum+=newValue }
    println(max)
    println("observed is ${observed}")

    max=10
    println("observed is ${observed}")
    max=5
    max=3
    println("$max")
    println("Sum:$sum")
}
