

// A generic function is a function that is declared with type parameters
// When called, actual types are used instead of the type parameters
// generic constraints -> upper bound
// Lambda functions / expressions a fun with0ut a name or without being declared

fun main(args: Array<String>) {

    // lambda func

    var sum = { x: Int, y: Int -> x + y }
    //print("The sum of x and y : ${sum (12, 12)}")

    // lambda as a unit

    val myLambda :  (Int) -> Unit = { p : Int -> println(p)}
    multiply(2, 4, myLambda)

    // higher order function --> fun as a parameter

    val addition = {num1 : Int, num2 :Int  -> num1 + num2 }
    println( " 5 + 10 = ${addition (5, 10)}")

}

fun multiply (a : Int, b : Int , myLambda : (Int) ->Unit)
{
    val multiply = a * b
    myLambda(multiply)
}



