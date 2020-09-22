package datatypes

fun main(args: Array<String>){
    /*
       Kotlin all data type start with first letter in capital
       1. Number
    `   A. Integer
            a. Byte
            b. Short
            c. Int
            d. Long

        B. Decimal
            a. Floating
                1. Float
                2. Double
     */
    val number:Int = 5
    val decimal: Double = 6.0
    val sum = number + decimal
    println("addition of number data type $sum")

    /*
    char means assign only one character
    2. Character
        a. Char
     */

    var char:Char = 'K'
    char = 'T'
    println("Display character $char")

    /*
    3. Boolean
        a. true
        b. false
     */

    var flag:Boolean = true
    flag = false
    println("display boolean value $flag")

    /*
    4. Arrays
        array means collection of elements of same type refered by same name
     */
    var name = arrayOf("Kotlin", "Basic", "Tutorial")
    println(name[1])
    println(name.size)

    /*
    5. String
    String is immutable, which means we cannot change the elements in String
     Type of string
      1. Escaped string
         declared within double quote (" ") and may contain escape characters like '\n', '\t', '\b' etc.
      2. Raw string
        declared within triple quote (""" """).
        It provides facility to declare String in new lines and contain multiple lines.
        Row String cannot contain any escape character.
     */

    //Escaped string
    val text1 ="Hello, kotlin Tutorial"
    val text2 ="Hello, welcome\n"
    val text3 ="Hello, \nkotlin"

    println(text1)
    println(text2)
    println(text3)

    //Raw string
    val text ="""  
             Welcome   
                To  
              Kotlin
            Raw string
    """

    println(text)
}