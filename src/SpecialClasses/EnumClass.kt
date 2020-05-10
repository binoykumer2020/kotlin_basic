package SpecialClasses

/*
Enum classes are used to model types that represnt a finite set of distinct values such as directions
states, modes and so forth
 */

// define a simple enum class with three enum instances. the bumber of instances is always finite and they are all distinct

enum class State {
    IDLE, RUNNING, FINISHED


}

fun main(args: Array<String>) {

    val state = State.IDLE
    val message = when (state)
    {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)
}