//Kotlin Program to Add Two Matrix Using Multidimesional dimensionalArray
package array

/*
fun main() {
    println("enter the rows num :")
    var row= readLine()!!.toInt()
    print("enter the column num :")
    var column= readLine()!!.toInt()
    var a =0
    var b =0
    var x =0
    var y =0
    for(i in 1..row){
        print("enter the 1 row vlue of first matrix : ")
        a= readLine()!!.toInt()

    }
    for(j in 1..column){
        print("enter the 2 row vlue of first matrix : ")
        b= readLine()!!.toInt()
    }
    for(i in 1..row) {
        print("enter the 1 row vlue of second matrix : ")
        var x = readLine()!!.toInt()
    }
    for (j in 1..column) {

        print("enter the 2 row vlue of second matrix : ")
        var y = readLine()!!.toInt()
    }

    println("a=$a")
    var firstarray= arrayOf (intArrayOf(1,2), intArrayOf(b) )
    var scondarray= arrayOf (intArrayOf(x), intArrayOf(y) )

    var sum= Array(row){IntArray(column)}

    for( i in 0..row-1){
        for (j in 0..column-1){
            sum[i][j]=firstarray[i][j]+scondarray[i][j]
        }
    }
    println("sum of two matrix :")
    for(row in sum ){
        for (column in row){
            print("$column     ")
        }
        println()
    }

}

*/


fun main() {
    val rows = 2
    val columns = 3
    val firstMatrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3))
    val secondMatrix = arrayOf(intArrayOf(-4, 5, 3), intArrayOf(5, 6, 3))

    // Adding Two matrices
    val sum = Array(rows) { IntArray(columns) }
    for (i in 0..rows - 1) {
        for (j in 0..columns - 1) {
            sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]
        }
    }

    // Displaying the result
    println("Sum of two matrices is: ")
    for (row in sum) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}


