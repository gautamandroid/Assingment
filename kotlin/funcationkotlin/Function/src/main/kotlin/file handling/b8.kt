package `file handling`
import java.io.File

//WAP to delete all file from a directory recursively

fun main() {
    val file= File("text1.text")
    if(file.delete()){
        println("file deleted")
    }
    else{
        println("file is not deleted")
    }
}