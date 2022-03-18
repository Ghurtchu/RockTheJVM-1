package lectures.part1basics

object CallByValVsCallByName extends App {

  def calledByValue: Long => Unit = long => {
    println(s"by value $long")
    println(s"by value $long")
  }

  def calledByName(x: => Long): Unit = {
    println(s"by name $x")
    println(s"by name $x")
  }

  calledByValue(System.nanoTime) // it's already computed before used, as if it was
  // already passed as 124712386213L in the place of System.nanoTime

  calledByName(System.nanoTime) // not computed before used,
  // only computed when it is used, to it's evaluated 2 times => 2 different values
  // defers the evaluation (useful in lazy streams, or things that might fail)

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  //  printFirst(infinite(), 34) // stack overflow

  printFirst(34, infinite())
  // by name parameter delays the evaluation of the expression until it's used
  // so no stackoverflow
  // since parameter y is never used it is never evaluated, so our program survives

  // call by value is the same as call by reference

  // call by value
  // value is computed before call
  // same value used everywhere

  // call by name
  // expression is passed literally
  // expression is evaluated at every use within
}
