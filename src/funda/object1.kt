package funda

// let create some Object

class  Cars {

    var name : String? = null
    fun honda () {
        println("I am a Honda car")
    }
}

fun main(args: Array<String>) {

    var honda1 = Cars ()
    honda1.honda()
    println(honda1.name)
}