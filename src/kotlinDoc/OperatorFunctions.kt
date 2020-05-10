package kotlinDoc


fun main(args: Array<String>) {
    // Infix function takes one step further using Operator function
    // times () is *n
    operator fun Int.times(str: String) = str.repeat(this)
    println(3 * "Ishaan ")

    // An operator function allows easy range access on strings
    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])
}