fun main(){
    forLoopDemo()
}

fun forLoopDemo(){
    for(i in 0..5){
        println(i)
    }

    val numbers = arrayOf(1,2,3,4,5) //array is mutable, fixed size
    for(num in numbers){
        println("For $num")
    }

    val names = listOf("Ashok", "Vasant", "Shankar") //list is immutable.For mutable list, use mutableListOf()
    for(name in names){
        println("Hello $name")
    }

    val names1 = arrayOf("naveen", "john", 1, 1.2) //elements of array are of mix data types
    for(name in names1){
        println(name)
    }
}