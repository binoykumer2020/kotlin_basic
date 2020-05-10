/*
In Kotlin all the classes and their related func are being treated as
final (a non accessible modifier) to use them we need to use keyword called open
 */

open class Parent {

    val name: String = " Parent"
    open fun displayInfo ( ){ println("Name is ${name}")}
   open fun run ( )
    {
        println(" Parent class can run")
    }
}

class Child : Parent ( ) {
    override fun run ( )
    {
        println("Child can run")
    }

    override fun displayInfo() {

        println("name is Child")
    }

}

fun main(args: Array<String>) {
    var child1 = Child()
    child1.run()
    child1.displayInfo()
}