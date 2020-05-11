package twinkle

// array function

fun main(args: Array<String>) {

    var arrayFunction = arrayOf(3, 5, 7, 0, 1, -8)

    /*
    arrayFunction.reverse()
    arrayFunction.forEach { println(" $it") }

    var newarrayFunction = arrayFunction.reversedArray()
    arrayFunction.forEach { print(" $it") }
    println()
    newarrayFunction.forEach { print(" $it") }
     */

    // Assending by default by sort() and for decending sortDecending ( )

    arrayFunction.sort()
    arrayFunction.forEach { println("$it") }



}