/*
Iterator: we can define our own iterator in our class by implementing iterator operator
1. define iterator in the class. It must be named iterator and have the operator modifier
2. returns next() and hasNext()
 */


package control_flow

class Animal (val name: String)
class Zoo (val animals: List<Animal>)
{
    operator fun iterator (): Iterator<Animal>
    {
        return animals.iterator()
    }
}

fun main(args: Array<String>) {
    val zoo = Zoo(listOf(Animal("tiger"), Animal("lion"), Animal("zebra")))

    for (animal in zoo){
        println("watch out, it's a ${animal.name}") }
}