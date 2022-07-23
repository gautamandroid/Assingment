//Kotlin Program to Check Leap Year
fun main()
{
    println("Enter a Year:")
    val year = readLine()!!.toInt()
    var leap = false

    if (year % 4 == 0)
    {
        if (year % 100 == 0)
        {
            leap = year % 400 == 0
        } else
            leap = true
    } else
        leap = false
        println(if (leap) "$year is a leap year" else "$year is not a leap year.")
}