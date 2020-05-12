package funda

// array  no square bracket

fun main(args: Array<String>) {

    var arr = arrayOf(1, 2, 3, 5)
    for (i in arr) {
          print(" $i") }

        // array without a defined value

        var arrayAppending = intArrayOf()

        for (i in 1..5) {
            arrayAppending = arrayAppending.plus(i * 5)
        }
        arrayAppending.forEach { println(" $it") }
    }

