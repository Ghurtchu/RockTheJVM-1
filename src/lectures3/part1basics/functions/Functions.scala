package lectures3.part1basics.functions

object Functions extends App {

  println(Function.aFunction("str", 5))
  println(Function.aParameterless)
  println(Function.aRepeatedFunction("hello", 3))
  println(Function.aTailRecursiveRepeatedFunction("hello", 3))
  println(Function.aBigFunction(5))
}

object Function:
  def aFunction(a: String, b: Int): String = a + " " + b // string concatenation
  def aParameterless: Int = 42
  def aRepeatedFunction(str: String, times: Int): String =
    if times <= 1 then str
    else str + aRepeatedFunction(str, times - 1)
  def aTailRecursiveRepeatedFunction(str: String, times: Int): String =
    @annotation.tailrec
    def go(n: Int, accumulated: String): String =
      if n <= 1 then accumulated
      else go(n - 1, accumulated + str)
    go(times, str)
  def aFunctionWithSideEffects(str: String): Unit = println(str) // function with side effect
  def aBigFunction(n: Int): String = {
    def aSmallFunction(n: Int): String = n.toString
    aSmallFunction(n)
  }