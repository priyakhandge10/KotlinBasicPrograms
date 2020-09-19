package variable

fun main(args: Array<String>){
    var temp:Int = 5  //mutable variable change later
    val number:Int = 6 //Immutable variable doesn't change
    val a:String  //declare
    a = "Kotlin" //assign
    println(temp)
    println(number)
    temp = 10
    println(temp)
    println(a)
}