package typeconversion

fun main(){
    /*
    Type conversion also known as Type casting.
    Type conversion is a process in which one data type variable is converted into another data type.
    Implicit conversion of smaller data type into larger data type is not supported.
    For example Int cannot be assigned into Long or Double.
    conversion is done by explicit in which smaller data type is converted into larger data type and vice-versa.
    This is done by using helper function.
    The list of helper functions used for numeric conversion in Kotlin is given below:
        toByte()
        toShort()
        toInt()
        toLong()
        toFloat()
        toDouble()
        toChar()
         */
    val value1 = 100
    val value2: Long =value1.toLong()
    println(value2)

    val value: Long = 200
    val value3: Int =value.toInt()
    println(value3)
}