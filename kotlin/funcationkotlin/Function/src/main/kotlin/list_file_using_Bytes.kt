import java.io.FileInputStream
import java.io.FileOutputStream

class Filereaderwrite{
    private val filename="text3.text"

    fun writefile(msg:String){
        val fos=FileOutputStream(filename)
        fos.write(msg.toByteArray())
        fos.close()
        println("file written succesfully")
    }
    fun readfile(){
        var fis=FileInputStream(filename)
        val bytes=fis.readAllBytes()
        fis.close()
        val msg=String(bytes)
        println(msg)
    }
}

fun main() {
    val frw=Filereaderwrite()
    frw.writefile("good moring ")
    frw.readfile()
}