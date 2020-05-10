
package SpecialClasses

/*
Data classes make it easy to create that are used to store values.
Such classes are automatically provided with methods for copying, getting a string representation and using
in collections

 */

data class  User ( val name : String, val id : Int) // Defines a data class with the data modifier

fun main(args: Array<String>) {

    val  user1 = User ("Binoy", 1) // methods toString() auto generated
    println(user1)

    val user2 = User("Ishaan", 2)
    println(user2)

    val user3 = User("Ishaan", 2)
    println(user3)
    // euality checker

    println(" user1 == user2 : ${user1 == user2}")
    println(" user2 == user3 : ${user2 == user3}")

    println(user1.hashCode())
    println(user2.hashCode())

    // copy functions

    println(user2.copy())
    println(user3.copy("Tejas", 3))

    // componentN functions get the values of properties in the order of declaration

    println(" name = ${user1.component1()}")



}

