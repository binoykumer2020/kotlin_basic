package control_flow

/* instead of wide used switch statement, kotlin provides a flexible and
clear When construction. it can be used as a statement or an expression
*/

// when statement

fun main(args: Array<String>) {

    // enter sime user defined inputs
    println("Enter a value between 1 to 7 : " )
    var input = Integer.valueOf(readLine())

    // when statement

    when (input){
        1 -> println("Today is Monday")
        2 -> println("Today is Tuesday")
        3 -> println("Today is Wednesday")
        4 -> println("Today is Thursday")

        else -> println("Entered input is not valid!!!!")
    }

    // when expression

    println("Enter a number between 1 to 5")
    var number = Integer.valueOf(readLine())

    fun assignNumber ( ) {
        val result = when (number)
        {
            1 -> println("ONE")
            2 -> println("TWO")
            3 -> println("THREE")

            else  -> println("Enter defined number")
        }
        return result
    }

}

