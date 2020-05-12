package funda

// data type  variables literals
// data type primitive and non primitive (Object) primitive such int, float etc -->object : String
// all primitive dsta type has a Object Data type sich Integer Object

// var is mutable (variable) and val immutable ( constant) like final in Java

// Operator (+ - * ?) Operands (variables)
// range 1 to 10 ---> 1 .. 10
// reversed(), downto(), step 4, until () etc
fun main(args: Array<String>) {

    var range = 1 ..10 step 3
    range.forEach{
        println( "$it")
    }
}




