package twinkle

// when statement ...expression

fun main(args: Array<String>) {

    println("Enter a number between 1 to 7")
    var num  = readLine()

 /*   when (num) {
        "1" -> println("Today is Monday")
        "2" -> println("Today is Tuesday")
        "3" -> println("Today is Wednesday")

        else -> println("Enter a valid number")
    } */
    // expression
    var x =  when (num) {
        "1" -> println("Today is Monday")
        "2" -> println("Today is Tuesday")
        "3" -> println("Today is Wednesday")

        else -> println("Enter a valid number")
    }

    println("Heelo !! ${x}")

    var anyNumber = 15
    when {
        anyNumber % 2 == 0 -> println(" $anyNumber is an Even number.")
        else -> println("$anyNumber is an odd number.")
    }
}