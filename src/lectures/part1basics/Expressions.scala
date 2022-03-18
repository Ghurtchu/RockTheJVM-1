package lectures.part1basics

import scala.util.Random

object Expressions extends App {

  val x = 1 + 2 // an expression => evaluated to value, has a type (sometimes inferred)
  println(x)

  println(2 + 3 * 4) // Math expression, with operator precedence included

  println(1 == x) // tests for equality, evaluates to boolean, prints false

  println(!(1 == x)) // logical negation, prints true

  var aVariable: Int = 5

  // side effects
  aVariable += 10
  aVariable *= 2
  aVariable /= 4
  aVariable -= 1

  println(aVariable)

  // instructions (statements, procedures) vs expressions (calculations with no side effects)
  // instruction = do (imperative), tell a computer to do this, do that
  // expressions = value (declarative) tell a computer to compute a value

  // IF expression
  val aCondition = true
  val aConditionValue = if aCondition then 5 else 3 // returns 5 if true else 3

  println(aConditionValue)

  println(if true then 1 else 0)
  println(if 1 > 0 then true else false)

  // loops are discouraged, cause they are imperative rather than declarative
  var i: Int = 0

  while (i <= 10) {
    println(i)
    i += 1
  } // avoid, it's IMPERATIVE!

  // everything in Scala is an expression (computation with no side effects)

  val aWeirdValue = ({
    aVariable = 3
  }) // type = Unit, "void" equivalent of other languages
  println(aWeirdValue) // prints "()" because it's Unit (void)

  // examples of side effects: println(), whiles, reassigning (vars), expressions returning Unit, same as ()

  // code blocks

  val aCodeBlock = {
    // y and z are local values, can't be used outside of 'aCodeBlock' val blocks
    val y: Int = 2
    val z: Int = y + 1
    if z > 2 then "Hello" else "Goodbye" // value of last expression, no need to type "return" explicitly
  }

  println(aCodeBlock)

  // basic expressions: operators
  // if in scala is an expression
  // code blocks in scala ae expressions - the value of the block is the value of it's last expression

  // expressions vs instructions
  // instructions are executed (think Java), expressions are evaluated (think Scala)

  // 1. difference between "hello world" vs println("hello world") ?
  // answer: "hello world" is string and is a value
  // println("hello world") has a type of Unit, it has a side effect, just prints the string

  // 2.
  val someValue = 2 < 3 // type is Boolean

  val someOtherValue = {
    if someValue then 239 else 986
    42
  } // returns 42, thereby the type is Int

  

}
