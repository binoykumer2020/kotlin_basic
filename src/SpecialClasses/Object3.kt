package SpecialClasses


/*
Object declaraton : it is not an expression and can't be used in a variable assignment.
You should use it to directly access its members
 */

object DoAuth {  // object declaration
    fun takeParams( username : String, password : String){  // odefines object method
        println("input Auth parameters = $username : $password")

    }
}

/* An object declaration inside a class defines another useful case: the companian object
Its similar to static methos. wecan call object members using its class name as a qualifier
*/

class Bigben {

    companion object Bonger {
        fun getBongs ( nTimes : Int){
            for (i in 1 ..nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main(args: Array<String>) {

    DoAuth.takeParams("foo", "qwerty") // calls the method

    Bigben.getBongs(10)
}
