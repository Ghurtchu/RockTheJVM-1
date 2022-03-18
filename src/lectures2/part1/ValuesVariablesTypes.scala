package lectures2.part1

import scala.Predef.println as p

object ValuesVariablesTypes extends App :

  val x: Int = 42

  val pr: Int => Unit = p(_)

  pr(x)

  val str = "str" // compiler infers the type of "str" to be String, no need to specify it

  val aBoolean: Boolean = true
  val aChar: Char = 55
  val aChar2: Char = 'c'
  val anInt: Int = 444
  val short: Short = 23
  val aLong: Long = 1235123L
  val aFloat: Float = 125.552F
  val aDouble: Double = 3125123.3

  // var-s can be changed, val-s are used to store values like Strings or function values like lambdas
  var aVariable: Int = 55
  aVariable += 1
