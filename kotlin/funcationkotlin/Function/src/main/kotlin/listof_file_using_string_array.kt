import java.io.File

fun main() {
    val file=File("c:\\users\\HP")
    if (file.exists())
    {
        println("file is exists")
        val Filename=file.list()

        for (tempfile in Filename)
        {
            val tempfile=File(file,tempfile)
            if (tempfile.isDirectory)
            {
                println("$tempfile is dir")
            }
            else
            {
                println("$tempfile is file")
            }
        }
    }
    else
    {
        println("file is not exists")
    }
}