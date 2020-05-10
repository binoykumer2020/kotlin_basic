package kotlinDoc

// member functions and extensions with a single parameter can be turned into infix functions


fun main(args: Array<String>) {

    // Defines as infix extension function on Int (adding an infix modifier

    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Ishaan ") // calling the infix function
    println(4 times "Ishaan ")

    // Creating a Pair by calling the infix function to from the standard library

    val pair = "Ishaan" to "Kumer"
    println(pair)
    // Our own implementation of to creatively called onto
    infix fun String.onto(other: String) = Pair(this, other)
    val myPair1 = "Binoy" onto "Ishaan"
    println(myPair1)

    infix fun String.likes(any: String) = Pair(this, any)
    val myPair2 = "Binoy" likes "Nandini"
    println(myPair2)


    //A mutable object can be changed after it's created, and an immutable object can't.
    // In Java, everything (except for strings) is mutable by default:


}