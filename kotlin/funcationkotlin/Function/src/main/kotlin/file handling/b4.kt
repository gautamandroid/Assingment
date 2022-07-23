package `file handling`

import java.io.File

//WAP to append text in a file

fun main() {
    val args:String="kotlin"
    File("create.text").appendText(args)
}
