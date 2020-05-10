package control_flow

import kotlin.math.max

/*
== for structural comparison and === for referential comparison
 */

fun main(args: Array<String>) {

    val fruit1 = setOf("Mango", "Apple", "Orange")
    val fruit2 = setOf("Apple", "Orange", "Mango")

    println(fruit1 == fruit2)

    println( fruit1 === fruit2)

    // conditional expression

    fun maximum ( x : Int, y: Int) = if (x > y) x else y

    println(max(99, 67))


}