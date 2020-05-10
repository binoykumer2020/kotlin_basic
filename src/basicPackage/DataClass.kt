package basicPackage/*
A data class is like a regular class but with some additional functionality
only getters and setters ..containers of data that used for other class
a real world entity --a utility function --> a large amount of data for storing
1. primary constructor needs to have a at least one parameter
2. All primary constructor needs to be marked as val or var
3. Data classes cant be abstract, open, can't be instantiated but basicPackage.sub classed
4. may not extend other classes --.. cant be inherited but interfaced
 */

data class User(val  name : String, val age : Int)  // destructing declaration

val obj1 = User("Binoy", 34)
val Employee = obj1.copy(age = 45)


