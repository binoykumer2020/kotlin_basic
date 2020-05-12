package funda

//https://try.kotlinlang.org/#/Examples/Hello,%20world!/Simplest%20version/Simplest%20version.kt


fun main(args: Array<String>) {

  /*
    println("Enter you name : ")
    var name = readLine()
    println("You've entered $name")

    println("enter a number: ")
    var num = Integer.valueOf(readLine())
    println(num + 10)
*/
    println("enter a number: ")
    var number1 = readLine()

    if ( number1 != null){
        var number2 = number1.toInt()
        println(number2 * 12)
    }



}