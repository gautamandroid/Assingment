//. Kotlin Program to Reverse a Sentence Using Recursion
package function

fun main() {
    print("enter the santance :")
    val sentence = readLine()!!
    val reversed = reverse(sentence)
    println("The reversed sentence is: $reversed")
}

fun reverse(sentence: String): String {
    if (sentence.isEmpty()) {
        return sentence
    } else {
        return reverse(sentence.substring(1)) + sentence[0]
    }
}
