package basicPackage

fun main(args : Array<String>)
{
    println("Hello world")
    println("hello Ishaan")

    var a =10
    var b = 20;
    println(a+b)

    var Binoy = Kotlin()
    Binoy.name = "First Class"
    println("The given name is :" + Binoy.name + " and I am really enjoying it")
    // another method to print
    println("The another way: ${Binoy.name}" + " so cool")

    var CountryName = Kotlin()
    CountryName.country = "India"
    println("${CountryName.country}")

}