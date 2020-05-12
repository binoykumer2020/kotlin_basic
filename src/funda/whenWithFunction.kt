package funda

// we are going to use when with a function

fun main(args: Array<String>) {

    fun checkNumber (num : Int) = when {

        num > 0  -> "positive"
        num < 0  -> "negative"
        else  -> "zero"
    }

    println(checkNumber(-9))
}