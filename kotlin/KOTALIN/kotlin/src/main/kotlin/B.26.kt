// Kotlin Program to Count the Number of Vowels and Consonants in a Sentence
fun main() {
    println("enter the sentence :")
    var p= readLine()!!
    var  countup=0
    var countnp=0
    for(i in 0..p.length-1){

        var v= p[i]
        if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U'){
            countup++
        }
        else{
            countnp++
        }
    }
    println("Number of Vowels : $countup")
    println("number  of Consonants : $countnp")
}