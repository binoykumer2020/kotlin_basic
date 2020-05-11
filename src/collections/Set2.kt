package collections


val studentsAttended : MutableSet<String> = mutableSetOf("Jay", "Rakhi", "Pranav")

fun addANewStudent ( newStudent : String) : Boolean
{
    return studentsAttended.add(newStudent)
}

fun getStatus ( isAdded : Boolean) : String
{
    return if (isAdded) "Registered successfully." else " marked as duplicate and rejected."
}

fun main(args: Array<String>) {

    val aNewUser : String = "Ishaan"
    val alredayIn : String = "Rakhi"

    println(" $aNewUser ${getStatus(addANewStudent(aNewUser))}")

    println(" $alredayIn ${getStatus(addANewStudent(alredayIn))}")
}
