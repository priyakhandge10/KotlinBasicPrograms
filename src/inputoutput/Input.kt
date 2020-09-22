package inputoutput

import java.util.*

fun main(){
    /*
    standard library function readLine() which is used for reads line of string input from standard input stream.
    It returns the line read or null.
    */
    println("Enter your name:")
    val name = readLine()
    println("Enter your age:")
    val age:Int = Integer.valueOf(readLine())
    println("my name is $name and my age is $age")
    /*
    While using the readLine() function, input lines other than String are explicitly converted into their corresponding types.
    To input other data type rather than String, we need to use Scanner object of java.util.Scanner class from Java standard library.
     */
    val read = Scanner(System.`in`)
    println("Enter your age:")
    val age1: Int = read.nextInt()
    println("your age is $age1")
}