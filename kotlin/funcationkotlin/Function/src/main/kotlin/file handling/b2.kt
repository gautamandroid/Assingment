package `file handling`

import java.io.FileReader
import java.io.FileWriter

//WAP to read contents of file


class Filereadwrite1
{
    private val filename="text2.txt"

    fun readfile(){
        var reader= FileReader(filename)
        val msg=reader.readText()
        reader.close()
        println(msg)
    }

}

fun main() {
    val frw1=Filereadwrite1()
    frw1.readfile()
}