package basicPackage

// find a person can drive a car

fun main(args: Array<String>) {

    var a : Int = 1000
    var b : Int = 200

    if (a<b)
        println(" $b is a greater than $a")
    else
        println("$a is greater than $b")

    println("Enter age :")
    var age = Integer.valueOf(readLine())

    println(" You entered $age , lets find out your eligibility of driving licence")

    if (age >= 18)
        println("You are eligible for driving")
    else  (
        println("Sorry you are not eligible")
    )
}
