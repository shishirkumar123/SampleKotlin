fun main() {
    /*
    In every Kotlin file, I created fun main(). This was allowed.
    But if I put same name of any other function,which are not inside a class,
    compiler complains. Why?
    * */
    callMe()
    println(callMeToo())
    withParam(paramVal = "sochenge tumhe pyar karen ke nahi")
    withParam(paramVal = "O meri dilruba")
}

fun callMe(){
    println("from call me")
}

fun callMeToo() : String{
    return "Hi"
}

fun sayHello():Unit{ // Unit seems to be somewhat like void
    println("Hello")
}

fun returnHi():String = "Hi"

fun withParam(paramVal: String){
    println("The value passed is $paramVal")
}

