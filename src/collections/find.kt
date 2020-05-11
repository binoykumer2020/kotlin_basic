package collections

// find and findlast functions
val words = listOf("Lets", "find", "something", "in", "collection", "somehow")
var first = words.find { it.startsWith("some") }
var last = words.findLast { it.startsWith("some") }
var find1 = words.find { it.contains("nothing") }
var find2 = words.find { it.contains("collection") }

// first nad last functions
val numbers = listOf(1, -2, 3, -4, 5)

val firstNumber = numbers.first()
val lastNumber = numbers.last()
val firstEven = numbers.first { it % 2 == 0 }
val lastOdd  = numbers.last { it % 2 != 2 }

// count function

val countNumber = numbers.count()
val countEven = numbers.count { it % 2 == 0 }

// sorted functions

val shuffled = listOf(5,4,1,5,8)
val natural = shuffled.sorted()
val inveted = shuffled.sortedBy { -it }

// zip function merges two given collections into a new collection. By default, the result collection contains
// Pairs of source collection elements with the same index

val A = listOf("a", "b", "c")
val B = listOf(1,2,3,4) // define two collections

val resultPairs = A zip B  // merging them together
val resultReduce = A.zip(B) { a,b -> "$a$b"}


fun main(args: Array<String>) {
    println(first)
    println(last)
    println(find1)
    println(find2)

    println(firstNumber)
    println(lastNumber)
    println(firstEven)
    println(lastOdd)

    println(countNumber)
    println(countEven)

    println(shuffled)
    println(natural)
    println(inveted)

    println(resultPairs)
    println(resultReduce)



}