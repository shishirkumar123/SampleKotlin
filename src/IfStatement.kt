fun main() {
    //if statements are just like Java
    var i = 11
    if(i > 10){
        println("$i is greater than 10")
    }else if(i==10){
        println("i is equal to 10")
    }else {
        println("$i is less than 10")
    }

    if(i % 2 == 0) {
        println("$i is even")
    }else{
        println("$i is odd")
    }
    //Just like java, not equal to also work same way (i != 10)

    //Equivalent of java switch

    var day = "Tuesdaya"
    when(day){
        "Monday" -> println("Manic monday")
        "Tuesday" -> println("Tiring tuesday")
        else -> println("fun day")
    }

    val dayOfWeek = if(day != "Monday") "Not Manic" else "Manic"
    println(dayOfWeek)
}