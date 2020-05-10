package functionals

/*
Lambda functions are a simple way to create functions ad-hoc. Lambdas can be denoted very concisely
in may cases thanks to type inference and implicit it variable
 */

// All examples create a function object that performs upper-casting
// so its a functon from String to String

val upperCase1 : (String) -> String = {it.toUpperCase()} // for lambda with a single parameter you dont need to explicitly name it, instead we can use implicit it variable
val upperCase2 : (String) -> String = String ::toUpperCase // : : if your lambda consists of a sgle function call you may use function pointers (: : )


fun main(args: Array<String>) {
    println(upperCase1("Hello123"))
    println(upperCase2("world!"))
}
