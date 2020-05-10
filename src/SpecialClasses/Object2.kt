package SpecialClasses

// plan is to create an object where we could detail all the exam result based
// on that found whether he is eligible for admission
// eligibility : average score of 70%

fun modulesToAttendToGetAdmission ( mathsQs : Int, physicsQs : Int, chemistryQs : Int) : Unit
{
   val totalMarks = object  {
       val mathsPaper : Int = 2 * mathsQs
       val physicsPaper : Double = 2.5 * physicsQs
       val chemistryPaper : Int = 1 * chemistryQs
   }
    var total = totalMarks.mathsPaper + totalMarks.physicsPaper + totalMarks.chemistryPaper
    val average = total/3

    println("Total marks : ${total}")
    println("Average % is : ${average}")

    if (average >70){ println("The student is eligible for admission")}
    else (println(" Not successful this time"))

}
fun main(args: Array<String>) {
    modulesToAttendToGetAdmission(34, 21, 94)
}