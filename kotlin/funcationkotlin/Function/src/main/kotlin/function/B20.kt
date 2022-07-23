//WAP to demonstrate the use of not null property.(not null withDelegates)
import kotlin.properties.Delegates


fun main()
{
    var max: Int by Delegates.notNull()
    //max=10
    println(max)
}
