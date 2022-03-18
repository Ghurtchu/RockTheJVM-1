package lectures2.part1

object CallByNameVsCallByValue extends App :

  def callByValue(x: Long): Unit = {
    // x is computed in client
    // then x is passed here
    // x is copied and therefore never changed after subsequent invocations

    // so first it's evaluated and then the value is passed here

    // it's like as if it was calculated and result was like 123456
    // and then 123456 was passed in the function parameter as an argument
    println(s"call by value: $x") // println(s"call by name: " + 123456)
    println(s"call by value: $x")
  }

  def callByName(x: => Long): Unit = {

    // x is passed here as a reference
    // then x is computed everytime it is being used,
    // that's why here are 2 different results

    // so the evaluation is delayed until it's used
    // and it's being evaluated everytime it's used

    // it's like as if it all the occurrences of x being replaced by
    // the client expression such as System.nanoTime()
    println(s"call by name: $x") // println(s"call by name: ${System.nanoTime()}")
    println(s"call by name: $x")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int): Unit = println(x)

  // stack overflow because it tried to calculate and evaluate infinite() first
  // before evaluating printFirst(_, _)
  //  printFirst(infinite(), 34)

  // here the evaluation is delayed, because it was passed by name
  // since it's never used therefore it is never evaluated, therefore we don't have
  // stack overflow error here

  printFirst(15, infinite())

  def exceptionFunction(): Int = 5 / 0

  def aFunc(a: Int, b: => Int): Unit =
    println(a)

  //  aFunc(exceptionFunction(), 5) // ArithmeticException will be thrown
  aFunc(5, exceptionFunction())
