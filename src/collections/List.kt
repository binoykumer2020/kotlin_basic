package collections

/*
A list is an ordered collections of items. Lists can be either mutable (MutableList) or read-onle (List)
for list creation use the standard library functions lostOf() for read-only list and mutableListOf() for mutable lists
 */

val systemUsers : MutableList<String> = mutableListOf("Binoy", "Ishaan", "Tejas") // creates a MutableList

// I would like to add a new user to the MutableList--. which is changeable
fun addSudoer (newUser : String )
{ systemUsers.add(newUser) }

val sudoers : List<String> = systemUsers // creates a read-only view of list

// a function that creates an immutable List--> read only not changeable

fun getSysSudoers ( ) : List<String>
{ return sudoers }

fun main(args: Array<String>) {
    addSudoer("Jaisal")
    println("Total number of sudoers : ${getSysSudoers().size}")

    getSysSudoers().forEach {
        i  -> println(" some useful info on user $i")
    }
}

