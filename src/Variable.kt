var topLevelVariable = "Hey"
const val topLevelConstant = "Yes?"
val whatAmI = "what the heck am I with a warning"

fun main(){
    println(topLevelVariable)
    println(topLevelConstant)
    println(whatAmI)
    variableDemo()
}

fun variableDemo(){
    var iAmMutable = 5
    println("Value of iAmMutable: $iAmMutable")
    iAmMutable = 7
    println("My changed value is: $iAmMutable")

    val iAmNotMutable = 2
    println("Value of iAmNotMutable: $iAmNotMutable")
    //iAmNotMutable = 3   //val can't be reassigned

    var iAmString:String = "I am String"
    //iAmString = 2             //Integer literal doesn't conform to the expected type String
    //iAmMutable = "New value"  //Type mismatch. Even this is not allowed. So what is the need to specify data type?

    var nullable = null         //Allowed
    //var notNullable: String = null    //Not allowed. By default, String type is not nullable.
    var nullable2: String? = null //Allowed

    var myVarArray = arrayOf(1,2,3,4,5)
    myVarArray = arrayOf(2,4,6,8,0)
    println("myVarArray - $myVarArray")
    //myVarArray = arrayOf('a', 'b') //Type mismatch.

    val myValArray = arrayOf(1,2,3,4,5)
    //myValArray = arrayOf(2,4,6,8,0) //Not allowed

}