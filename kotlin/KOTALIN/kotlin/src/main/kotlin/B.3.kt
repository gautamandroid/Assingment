//Kotlin Program to Check Whether an Alphabet is Vowel or Consonant
fun main()
{
    println("Enter Alphabet:")
    val alpha= readLine()

    val check=alpha!!.toCharArray()[0]
    val vowel= arrayOf('a','e','i','o','u','A','E','I','U','O')
    val result=if(vowel.contains(check)) "Vowel" else "Consonant"
    println("Character-($check) is $result")
}