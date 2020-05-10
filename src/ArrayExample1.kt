import java.util.*


fun main(args: Array<String>) {

    // array is representing Array Class--mutable and fixed size --init function
    // ArrayOf() intArrayof()

    var num1 = arrayOf(1,2,2,4,5,3)

    println(num1[0])
    num1 [0] =100
    println(Arrays.toString(num1))

    // get and set method to arrays

    var num2 = arrayOf(100,200,300,400)
    println(num2.get(1))
    num2.set(0, 700)
    println(Arrays.toString(num2))

    // add an element to an array for example in num1

    val newnum1 = num1.plus(1)
    println(Arrays.toString(newnum1))
    println(newnum1.first())
    println(newnum1.last())
    println(newnum1.indexOf(4))






    // var num2 = IntArray(6,{i: Int -> i  }) // array with an range


}





