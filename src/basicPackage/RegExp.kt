package basicPackage

import kotlin.test.assertTrue

/*
A pattern is a regular expression that defines the text we are searching for or manipulating
It consists of text literals and metacharacters
Ignore(), Literal (), Unix Line
 */

fun main(args: Array<String>) {
    val regex = """a([bc]+)d?"""
  //  assertTrue ( regex matches ("abc"))

}