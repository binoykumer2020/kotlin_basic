package funda

// null pointer exception
/*
In Kotlin all the data type is null but how to assign a null ny using a ?
in java usually it trows an exception
 */

fun main(args: Array<String>) {

    var name : String? = "Binoy"
    var ifNullName : String? = null // ? mark  -> safe call

  //  println(ifNullName?.length)  // print null

    // another way

    var country : String? = "United Kingdom"
    if (country != null){
     //   println(country.length)
    }
    // elvis operator

    var len = name?.length?:-1
   // println(len)

    //    if I need to see null exception like in java  --> assert operator !!

    println(name!!.length)



}
