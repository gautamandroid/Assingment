package `file handling`

import java.io.File

//WAP to iterate through all files in a directory

fun main() {
    File("C:\\Users\\HP\\funcationkotlin\\Function\\src\\main\\kotlin").walk().forEach { println(it) }
}