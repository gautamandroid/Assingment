package `file handling`

import java.io.FileReader
import java.io.FileWriter

class Filereadwrite2
{
    private val filename="text3.txt"

    fun writefile1(msg:String){
        val writer= FileWriter(filename)
        writer.write(msg)
        writer.close()
    }
}

fun main() {
    val frw1=Filereadwrite2()
    frw1.writefile1("prince vasoya ")
}