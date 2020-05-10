import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueConstant

fun main(args: Array<String>) {

    println("Enter your name : ")
    val name = readLine()

    println("Enter your age")
    //val age = readLine()
    // another way we can do it
    val age : Int = Integer.valueOf(readLine())

    println("Therefore, person name is ${name} and age is ${age}")
}