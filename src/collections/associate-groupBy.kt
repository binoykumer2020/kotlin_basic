package collections


/*
Functions associateBy and groupBy build maps from the elements of a collections by the specifoed key
The key is defined in the keySelector parameter. You can also specify an optional valueSelector
The difference between associateBy and groupBy is how they process objects with the same key: associateBy uses the
last suitable element as the value. groupBy builds a list of all suitable elements and puts it in the value.
 */

// Define a data class that describe a person

data class  Person ( val name: String, val city: String, val phone_no : String)

// create a collection of data i.e people

val people = listOf(
        Person("Binoy", "London", "12345"),
        Person("Ishaan", "London", "98765"),
        Person("Rhittika", "NewYork", "56773"),
        Person("Oishee", "Sydney", "674655")
)

// build a map from the phone_no to their owners info; it.phone_no is the key selector here and value selector is not provided

val PhoneBook = people.associateBy { it.phone_no } // valueSelector is not provide that can invoke from Person objects
val phoneBook2 = people.groupBy(Person :: city, Person ::phone_no)
// building a map from the phone_no to the city where the owners live; Person ::city
val cityBook  = people.associateBy ( Person ::phone_no, Person ::city)
// Builds a map that contains cities and people living there. The values of the map are lists of persons names
val peopleCities = people.groupBy(Person ::city, Person ::name)

fun main(args: Array<String>) {
    println(cityBook)
    println(PhoneBook)
    println(peopleCities)
    println(phoneBook2)





}