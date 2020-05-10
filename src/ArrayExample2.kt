import java.util.*

fun main(args: Array<String>) {

    var num = arrayOf(1, 4, 5, 7, 20,4)
    // println("There are ${num.count()} elements in the array ")

    val evens = num.count{it % 2 ==0}
    //println("There are ${evens} even numbers in the array")

    // sorting an array
    val sortNum = num.sortedArray()
   // println(Arrays.toString(sortNum))

   // println(Arrays.toString(num.sortedArrayDescending()))

    // two dimentional array

    val array = arrayOf(intArrayOf(1,3), intArrayOf(3,6), intArrayOf(5,9))
    println(Arrays.deepToString(array))
}