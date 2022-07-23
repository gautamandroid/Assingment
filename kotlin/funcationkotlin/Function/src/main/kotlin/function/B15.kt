//WAP to print length of String with smart cast. (use “is” operator)
fun main() {
    var str ="vasoya prince jayshukhbahi"

    if(str is String){
        print("string lenght :${str.length}")
    }
}