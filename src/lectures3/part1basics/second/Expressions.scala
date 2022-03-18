package lectures3.part1basics.second

object Expressions extends App {

  val x = 1 + 2 // 1 + 2 is an expression, they are evaluated to value and they have a type (in this case => Int)
  println(x) // this is also an expression with type Unit ( I swear god )

  println(2 + 3 * 4) // => 2 + (3 * 4) = 2 + 12 = 14
  // math ops => +, -, *, /, &, |, ^, <<, >>, >>> (math and binary ops)
  println(1 == x) // equality (value equality)
  // ==, !=, >, >=, <, <=
  println(!(1 == x)) // unary operator, logical negation
  // !, -

  var aVariable: Int = 2
  println(aVariable)
  aVariable += 10 // 12, this is a side effect :(
  println(aVariable)

  // Instructions vs Expressions
  // Instructions - do things(change variable, print to console, do this do that..)
  // Expressions - evaluate to value, something that has a value and type (without side effects)

  // IF expression (evaluates to value)
  val aCondition = true
  val aConditionedValue: Int = if aCondition then 5 else 3
  println(aConditionedValue)

  // same code but imperative style (instructions)
  var value: Int = 0
  private val assignment: Unit = if aCondition then
    value = 5
  else
    value = 3
  println(assignment) // unit
  println(value)

  // loops (imperative => bad)
  // btw this is discouraged XD
  var i: Int = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // unit
  val aWeirdValue: Unit = aVariable = 3
  val anotherWeirdValue: Unit = {
    println("xd")
    for i <- (1 to 10).toList do println(i)
    ()
  }
  println(aWeirdValue)
  println(anotherWeirdValue)

  // side effects: println(), whiles, reassigning, indexed for loops, etc..

  val aCodeBlock: Boolean | Int = {
    val a = 5
    val b = a + 5
    println("what?")
    if b > 5 then 1 else false
  }

  println(aCodeBlock)

  // difference between "hello world" and println("hello world")
  // answer: "hello world" is a String value and println("hello world") prints it to console and has a type of Unit

  val someValue = {
    2 < 3 // true
  } // true (Boolean)

  val someOtherVal = {
    if someValue then 239 else 986
    42
  } // Int (42)

}
