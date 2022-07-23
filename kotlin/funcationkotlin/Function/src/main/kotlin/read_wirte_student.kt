import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class filewirteread(){
    private val filename="text4.text"
    fun writestudent(student: student){
        val fos=FileOutputStream(filename)
        val oos=ObjectOutputStream(fos)
        oos.close()
        fos.close()
        println("student written")
    }
    fun readstudent(){
        val fis=FileInputStream(filename)
        val ois=ObjectInputStream(fis)

        val student=ois.readObject()as student
        println(student)
        ois.close()
        fis.close()

    }
}
fun main() {
    val frw=filewirteread()
    val student=student("prince","vasoya")
    frw.writestudent(student)
    frw.readstudent()
}