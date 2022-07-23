fun main() {
    print("enter the one number :")
    var a= readLine()!!.toInt()
    print("enter the scond number :")
    var b= readLine()!!.toInt()

    while (a != b){  //81 != 153
        if(a>b){  //81>153
            a=a-b   //81=81-153
        }
        else{
            b=b-a
        }

    }
    println("G.C.D= $a")
}