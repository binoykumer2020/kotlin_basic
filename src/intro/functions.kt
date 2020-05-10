package intro

// Default parameter values and named arguments
// a simple function that takes a parameter of type String and returns Unit (i.e No return value)

fun printmessage(message: String): Unit {
    println(message)
}

// A function that takes a second optional parameter with default value as Info and returning is omitted meaning actually Unit

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

// a function that returns as an integer

fun sum(x: Int, y: Int): Int {
    return x + y
}

// A single-expression function that returns an integer

fun multiply(x: Int, y: Int) = x * y


fun main(args: Array<String>) {

    printmessage("Hello")
    printmessage("display any message")
    printMessageWithPrefix("Hello Ishaan")
    println(" Sum of the x and y is ${sum(1, 2)}")
    println(" Multiplication of x and y is : ${multiply(12, 10)}")

}