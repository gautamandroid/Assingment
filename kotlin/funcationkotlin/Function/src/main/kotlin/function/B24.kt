//WAP to solve following runs problem.(Advanced)
//Any array may be viewed as a number of "runs" of equal numbers.
//For example, the following array has two runs: 1, 1, 1, 2,2
//Three 1's in a row form the first run, and two 2's form the second.
//This array has two runs of length one: 3, 4
//And this one has five runs: 1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0,0

fun main() {
    var run = intArrayOf(1, 1, 1, 2, 2)

    var count1 = 0
    var count2 = 0
    for (i in run) {
        if (run[i] == i)
        {
            count1++

        } else {
            count2++
        }

    }
    println("${run[0].toInt()} Total Run of $count1")
    println("${run[3].toInt()} Total Run of $count2")
}

