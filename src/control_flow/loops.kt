package control_flow

fun main(args: Array<String>) {

    for (i in 1 .. 10)
    { println(i) }

    val cakes = listOf("carrot", "Cheese", "vanilla", "Chocolate" )
    for (cake in cakes)
    {

        println("Yummy, it's a $cake cake!")

    }
}