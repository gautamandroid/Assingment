fun main() {
    var str1="hello"
    var str2= String(StringBuffer("hello"))

    if(str1==str2){
        println("equals")
    }else{
        println("not equals")
    }
    //steucthural equality
    if(str1===str2){
        println("equals")
    }else{
        println("not equals")
    }
}