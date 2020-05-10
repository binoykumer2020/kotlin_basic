// standard lib fun--implicitly used such square, root etc
// User defined fun --> explicitly used such addition of two numbers

fun main(args: Array<String>) {

    println("The sum of a and b is : ${sum(12,56)} ")
    sub(12,4)

    println(" Multiplication of a and b is : ${multiplication(12, 12)}")


    // another way to use fun

    val addition = {num1 : Int, num2 : Int -> num1 + num2 }

    println("Addition of num1 and num2 is : ${addition(12,12)}")

}

fun sum (a :Int, b : Int) : Int
{ return a + b

}

fun sub ( a : Int, b : Int)
{ print(a-b)

}

fun multiplication (a:Int, b:Int) : Int = a*b

