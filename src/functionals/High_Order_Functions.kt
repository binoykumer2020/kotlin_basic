package functionals

import sun.jvm.hotspot.debugger.win32.coff.DebugVC50SSSrcLnSeg

/*
A high order function is a function that takes another function as a parameter and/or returns a function
 */


// function expreseion
// declares a higher order function with two parameters and additionally takes another function operation as a parameter
// operation functional lambda returns Int as well

fun sum ( x : Int, y : Int) = x +y

fun calculate ( x: Int, y: Int, operation : (Int, Int) -> Int) : Int
{
    return operation (x,y)
}

fun main(args: Array<String>) {
    val sumResult = calculate(1,5, ::sum)

    val multipleResult = calculate( 2, 7) { x, y -> x * y}

    val subtractionResult = calculate(6, 4) { x, y -> x - y}

    println(sumResult)
    println(multipleResult)
    println(subtractionResult)
}