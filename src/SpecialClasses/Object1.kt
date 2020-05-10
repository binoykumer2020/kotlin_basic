package SpecialClasses

import java.util.*

/*
A class is a blue print and an object is an instance of a class. Usually we define a class and create multiple instances
of that class

In Kotlin we have also the object keyword. It is used to obtain a data type with a single implementation (singleton pattern)
To achieve this in Kotlin we need to declare an object: no class and no constructor
object expression: a simple object/properties structure and no need to declare class;
just create a single object and declares its members and access with in one functions
 */

// a simple class and its object implementation:
class LuckDispatcher {
    fun getNumber ( ){
       var objRandom  = Random()
      //  println(objRandom.nextInt(100))
    }
}

// a simple way to create an object
fun rentPrice (standardDays : Int, festiveDays : Int, specialDays: Int) :Unit {
    val dayRates = object {
        var standard : Int = 30 * standardDays
        var festive  : Int = 50 * festiveDays
        var special  : Int = 100 * specialDays
    }
    val total = dayRates.standard + dayRates.festive + dayRates.special
    println("Total price : $$total")
}

fun main(args: Array<String>) {
    val obj1 = LuckDispatcher()  // create obj instances for class LuckDispancer
    val obj2 = LuckDispatcher()

    obj1.getNumber() // calling the methods
    obj2.getNumber()

    rentPrice(12,3,4) // calling the function
}