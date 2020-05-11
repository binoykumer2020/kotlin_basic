package SpecialClasses


fun main(args: Array<String>) {

    val map = mapOf("Alice" to 21, "Bob" to 25) // destrcuted map

    for ((name, age) in map) {
        println("$name is $age years old.")
    }

    val (x, y, z) = arrayOf(10, 20, 30) // destruction of the array
    println(x + y + z)


  //  val (max, min) = findMinMax(listOf(100, 90, 0, -7, 45))// built in Pair

    data class  User (val username: String, val email: String) // define a data class
    fun getUser ( ) = User ("Mary", "mary@gmail.com")

    val user = getUser() // destructures an instance. Decaled values are mapped to the instance fields
    val (username, email ) = user
    println(username ==user.component1()) // data class automatically defines component1() methods taht will be called during destructuring

    val (_, emailAddress ) = getUser() // _ provided if you dont need any of the value




}


