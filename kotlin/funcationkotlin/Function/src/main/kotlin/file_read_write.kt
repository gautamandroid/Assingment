import java.io.FileReader
import java.io.FileWriter

class Filereadwrite1
{
    private val filename="text2.txt"

    fun writefile(msg:String){
        val writer=FileWriter(filename)
        writer.write(msg)
        writer.close()
    }
    fun readfile(){
        var reader=FileReader(filename)
        val msg=reader.readText()
        reader.close()
        println(msg)
    }

}

fun main() {
    val frw1=Filereadwrite1()
    frw1.writefile("vasoya prince j.")
    frw1.readfile()
}