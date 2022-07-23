//Kotlin Program to Find Largest Element in an Array
fun main() {

    var array= arrayOf(12,34,65,78,98,123,342,87,90)
    var largest=array[0]
    for (i in array){
        if(largest<i){
            largest=i
        }
    }
    print("largest number is : $largest")
}