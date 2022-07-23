import java.io.File

fun main() {

    val file=File("c:\\users\\HP")
    if(file.exists()){
        println("file exists")
        val filelist=file.listFiles()
        for(tempfile in filelist){
            if (tempfile.isDirectory){
                println("${tempfile.name}is directory")
            }
            else{
                println("${tempfile.name}is file")
            }
        }
    }
    else{
        println("file is not exists")
    }
}