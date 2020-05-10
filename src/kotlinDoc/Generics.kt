/*
Generics are generally mechanism. Generics classes and functions code reusability by encapsulating of a particular
generic type like List<T> is indepenedent of wjat T is

 */
package kotlinDoc

// the use of generics in creating generic classes

class  MutableStack<E> (vararg items : E)
{
    val elements = items.toMutableList()

    fun push ( element: E) = elements.add (element) // inside in the generic class E can be used as a parameter

    fun peek( ): E = elements.last()

    fun pop ( ): E = elements.removeAt(elements.size -1)

    fun isEmpty ( ) = elements.isEmpty()
    fun size () = elements.size

    fun toStrring ( ) = "MutableStack( ${elements.joinToString ( )}"

}

// we can also create a generic functions for example we can write a utility function to create mutable stacks

fun <E> mutableStackOf ( vararg elements: E) = MutableStack ( *elements)

fun main(args: Array<String>) {
    val stack = mutableStackOf(0.67, 123, 2.78, 0)
    println(stack.isEmpty())
    println(stack.toStrring())

    println(stack.push(123456))
    println(stack.toStrring())
    
}