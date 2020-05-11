package collections

/*
getOrElse provides safe access to elements of a collection. It takes an index and a function that provides the default
value in cases when the index is out of bound
 */

val list = listOf(0, 10, 20)
// it can be applied ti the map as well

val map = mutableMapOf<String, Int>()

fun main(args: Array<String>) {
    println(list.getOrElse(1) { 42 }) // print 10 as the eleemnt at the index 1
    println(list.getOrElse(10) { 42 }) // print 42 as the index 10 is out of bound


    println(map.getOrElse("a")  {12}  )

}