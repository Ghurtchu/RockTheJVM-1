package lectures2.part1

object Expressions extends App :

  val x: Int = 1 + 2 // expressions, same as 1.+(2) where 1 and 2 are operands, + is a method operator

  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  var aVar = 5
  aVar += 2 // it is allowed, since aVar is "var" not "val"

  // instructions vs expressions
  // instructions (Do that, do this, print that, computer that, show this to console, send this to server, etc..)
  // expressions (something that has a value/type, only the result of computation)

  val value: String = computeValue()
  val computed: String = compute

  println(computed)
  println(value)

  def computeValue: () => String = () => if Math.random() > 0.8 then "str1" else "str2"

  def compute: String = computeValue()

  val unitValue: Unit = ({
    val someCalculation: Double = 1 + 2 / 5
    ()
  })

  val anotherUnit = {
    println("what is going on")
  }

  val moreUnit = {
    val a: Int = 5
  }

  println(unitValue)

  println(anotherUnit)
  println(moreUnit)

  // it's an expression
  val codeBlock = {
    val y = 1 + 1
    val x = y + Math.random()
    if x > 2.5 then "BINGO" else "meh.."
  }

  println(codeBlock)

  // 1. difference between "hello world" vs println("hello world")
  // answer "hello world" is String and the other is Unit
  // 2. line 57
  // 3. line 63

  val someValue = {
    2 < 3
  }
  // answer, type = Boolean, value is true

  val someOtherVal = {
    if someValue then 239 else 958
    42
  }
