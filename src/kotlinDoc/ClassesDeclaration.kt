package kotlinDoc

/* class declaration consists of the class name  with class header ( type pf parameters and the
primary constructors and the class body surrounded by curly braces.
Both the header and the body are optional. If he class has no body, curly braces can be omitted
 */

// class declaed without any properties or user-defined constructors. A non parameterised default constructor
// is created Kotlin automatically

class Customer   // class created without any properties

class Contact ( val id : Int, var  email : String)  // class created with two properties immutable id and mutable email and a constructor with two parameters

fun main(args: Array<String>) {

    val customer = Customer ( )  // an instance of a class via the default constructor and no new keyword like in Java or JS

    val contract = Contact ( 1001, "test@123.com") // creates instance of the class with constructors with two arguments

    println(contract.id)

    println(contract.email)

    contract.email = "change@123.com"

    println(contract.email)

}



