package lectures.part1basics

object ValuesVariablesTypes {

  def main(args: Array[String]): Unit = {

    // val-s ARE IMMUTABLE, you can't reassign it to another value
    val x: Int = 42
    println(x)

    // x = 44 <- this is not allowed

    // type inference, compiler is smart enough to infer type, so types are optional
    val y = 55 // type = Int

    val aString: String = "Hello" // type = String

    val str: String =
      """
        |the long strings
        |could be written like this
        |""".stripMargin

    println(str)

    val aBoolean: Boolean = false // false or true, type = Boolean
    val aChar: Char = 'c' // character in single quotes
    val anInt: Int = 55 // 32 bits
    val aShort: Short = 55 // 16 bits
    val aLong: Long = 100000000123L // 64 bits
    val aFloat: Float = 2.6F // 32 bits
    val aDouble: Double = 3.14 // 64 bits

    // variables, that can be reassigned => changed
    var aVariable: Int = 5
    aVariable = 10 // side effects, changing the variable, printing something, etc
    
  }
  
}
