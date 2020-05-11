package collections

/*
A set is an unordered collections that does not support duplicates. For creating sets, there are functions setOf()
 and mutableSetOf().
 */

val openIssues : MutableSet<String> = mutableSetOf("issue1", "issue2","issue3") // create a mutable set

// now would like to add an issue that only return boolean whether new issues added

fun addissue ( addissue : String) : Boolean
{
    return  openIssues.add(addissue)
}

// I would like to get a status log as duplicates will be rejected

fun getSatatusLog ( isAdded : Boolean): String
{
    return if (isAdded) "registered correctly" else "marked as duplicate and rejected"
}

fun main(args: Array<String>) {
    val aNewIssue : String = "issue4"
    val anIssueAlreadyIn : String = "issue3"
     println("$aNewIssue ${getSatatusLog(addissue(aNewIssue))} ")

    println("$anIssueAlreadyIn  ${getSatatusLog(addissue(anIssueAlreadyIn))}"  )

}