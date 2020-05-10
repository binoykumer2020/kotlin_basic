package SpecialClasses

/*
Sealed classes let you restrict the use of inheritance. Once you declare a class sealed, it only can be sunclassed
from inside the same file where the sealed class declared. It can't be subclassed outside of the file
 */


sealed class  Mammal ( val name : String) // define a sealed class
class Cat ( val catName : String) : Mammal (catName) // defines sub class an it is on the same file
class Human (val humanName : String, val job : String) : Mammal (humanName)

fun greetMammal(mammal: Mammal){
    when (mammal)
    {
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}" // smart casting Mammal to HUman
        is Cat   -> "hello ${mammal.name}"
    }  // else is not reqired as all the possible sub classes of the sealed class are covered but non-sealed superclass else would be required
}

sealed class Cars (val name : String)
class Ford (val fordname: String, val price : Int) : Cars (fordname)
class Audi (val audiname: String, val price: Int, val colour : String) : Cars (audiname)

fun info ( cars : Cars){
    when (cars){
        is Ford  -> "Hello I am ${cars.name} and my price is ${cars.price}"
        is Audi  -> "Hello I am ${cars.name} and my price is ${cars.price} and my colour is ${cars.colour}"
    }
}

fun main(args: Array<String>) {
    println(greetMammal(Cat("Snowy")))

    println(info(Audi("ATY67", 12345, "Red")))
}