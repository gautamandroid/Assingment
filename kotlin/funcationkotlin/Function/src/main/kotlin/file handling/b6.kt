package `file handling`

import java.io.File

//WAP to copy a file to other

fun main() {
    val file=File("create.text").copyTo(File("copy.text"))
}