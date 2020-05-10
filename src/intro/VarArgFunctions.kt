package intro

fun main(args: Array<String>) {

    // the vararg modifier turns a parameter into vararg
    // this allows printall with any number of strings arguments

    fun printAll(vararg messages: String) {
        for (i in messages)
            println(i)
    }
    printAll("123", "Hello", "Vamos", "Nmanastee")

    // with prefix

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages)
            println(prefix + m)
    }
    printAllWithPrefix(" Hello ", " Ishaan", " Namastee",
            prefix = "Greetings")

}