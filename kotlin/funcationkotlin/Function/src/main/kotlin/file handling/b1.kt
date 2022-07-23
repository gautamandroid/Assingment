//WAP to create file.
package `file handling`

import java.io.File

fun main() {
    val file= File("text2.text")
    if(file.createNewFile()){
        println("file created")
    }else{
        println("file not created")
    }
    /*
     if(file.delete()){
         println("file deleted")
     }else{
         println("file not deleted")
     }
 */
}