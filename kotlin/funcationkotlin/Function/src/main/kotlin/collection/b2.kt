//Program:2 WAP to assign name and age to User class instance from properties of map. (properties in map)

fun main()
{
    val data= mapOf<String,Int>("abc" to 25,"klr" to 36,"xyz" to 45)
    val entries:Set<Map.Entry<String,Int>> = data.entries
    data.forEach {
        println("name:${it.key}........Age:${it.value}")
    }

}
