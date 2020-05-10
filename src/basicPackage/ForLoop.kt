package basicPackage

fun main(args: Array<String>) {

    // when replaces switch statements

    print("Enter a number in the console between 1 to 7 : ")
    val num = Integer.valueOf(readLine())

    when (num){
        1 -> print(" today is Monday")
        2 -> print(" today is Tuesday")

        else -> print("Please enter a valid number")
    }

    for (i : Int in 1 ..10){ println (i)}
}