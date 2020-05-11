package twinkle

// two dimentional array matrix RC ROW AND COLUMN  -->array of array



fun main(args: Array<String>) {

    var row1 = arrayOf('a', 'b', 'c','d')
    var row2 = arrayOf('x', 'y', 'z')
    var row3 = arrayOf(1, 2, 3, 4)

    var array = arrayOf(row1,row2,row3)

    for ( i in array){
        for (j in i) {
            print(" $j")
        }
        println()
    }

}