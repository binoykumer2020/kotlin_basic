package funda

// creating a function
// parameter args fun devs ( name : String )

fun main(args: Array<String>) {

    println(multiple(2,4))
    println(isMultiple(90))

    // testing function expression
    println(isMultipleFactor(20,5))

}

fun multiple (x: Int, y: Int ): Int {
    return (x * y)
}

fun isMultiple ( a: Int) : Boolean
{
   return  when  {
       a % 2 == 0  -> true
       else -> false
   }
}

// in line function --> function as an expression

// to find out whether m is mulptiple of n. Then we can use = and not required for return type

fun isMultipleFactor ( m : Int, n : Int) =
        when {
            m % n == 0  -> true
            else  -> false
        }

