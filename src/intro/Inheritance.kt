package intro

/*
Kotlin classes are final by default. for using class inheritance mark the class open modifier
and same for Kotlin methods
 */

open class Animal {
    open fun canEat ( ){
       // println(" can eat")
    }
}
// a class inherits a superclass when you specify the :Superclassname () after its name and empty parentheses means
// invocation of superclass default constructor
 class Dog : Animal( ){

   // override fun canEat () { println(" Dog can eat")}
}

// Inheritance with parameterized constructor

open class Tiger (val origin : String )
{
    fun sayhello(){
        println(" A tiger from $origin says : grrhhh!!")
    }
}

class SiberianTiger : Tiger("Siberia") // providing the constructor arguments

// Passing a constructor arguments to a super class

open class Lion ( val name : String, val origin : String)
{
    fun sayhello( )
    {
        println("$name, the lion from $origin says : groah!!!")
    }
}

class Asiatic (name: String) : Lion(name =name, origin = "India")
// name in the Asiatic declaration is niether var or val. Its a constructor argument
// whose value is passed to the property of the superclass
class Bengal (name: String) : Lion(name = name, origin = "Bangladesh")




fun main(args: Array<String>) {
    val dog1 = Animal()
    dog1.canEat()
    val dog2 = Dog()
    dog2.canEat()

    val obj1 : Animal = Dog()
    obj1.canEat()


    val tiger = SiberianTiger()
    tiger.sayhello()

    // another way
    val tigerObj: Tiger = SiberianTiger()
    tigerObj.sayhello()


    // creates an Asiatic instance
    val lion : Lion = Asiatic("Rufo")
    lion.sayhello()

    val lionbengal : Lion = Bengal("Royal bengal tiger")
    lionbengal.sayhello()
}