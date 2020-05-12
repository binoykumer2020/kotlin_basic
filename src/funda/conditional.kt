package funda

// logical statement ..expression-> return a value

fun main(args: Array<String>) {

    var number : Int  = 0

    if (number >  0 ){
        println("entered a positive number ")
    }
    else if (number <0 ) {
        println("entered a negative number")
    }
    else {
        println("entered zero")}

    // expression

    var result = if (number >  0 ) " positive number "
                                    else if (number <0 ) "negative number"
                                                else "zero"
    println(result)




}