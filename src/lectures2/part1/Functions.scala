package lectures2.part1

import scala.annotation.tailrec

object Functions {

  def main(args: Array[String]): Unit = {

    val concat: String = aFunction("I am", 22)
    println(concat)

    val concat2: String = concatenate("I am", 44)
    println(concat2)

    println(aParameterlessFunction())
    //    println(aParameterlessFunction) // not allowed withour parentheses
    println(aParameterlessFunc)
    println(aParameterlessFuncThatTakesUnit())
    println(aParameterless({
      {
        {
          {
            {
              {
                {
                  {
                    {
                      {}
                    }
                  }
                }
              }
            }
          }
        }
      }
    }))

    println(aRepeatedFunction("to be repeated", 0))
    println(aRepeatedFunction("to be repeated", 1))
    println(aRepeatedFunction("to be repeated", 3))
    println(repeatStringRecursively("to be repeated", 3))
    println(repeatStringRecursively("to be repeated", -344))

    println(repeatStringTailRecursively("to be repeated", 3))

    println(tailRecursiveJoin("str", 5))

    println(tailRecursiveSum(1, 5)) // should be 1 + 2 + 3 + 4 + 5 = 15

    println(tailRecursiveProduct(1, 5)) // basically a factorial

    println(tailRecursiveFactorial(5))

    println(tailRecursiveExists(List(1, 2, 3, 4, 5), 5))
    println(tailRecursiveExists(List(1, 2, 3, 4, 5), 1))
    println(tailRecursiveExists(List(1, 2, 3, 4, 5), 0))

    aFunctionWithSideEffects("this is going to be printed")

    println(aBigFunction(5))

  }

  def aFunction(a: String, b: Int): String = s"$a $b"

  def concatenate: (String, Int) => String = (text, number) => s"$text $number"

  def aParameterlessFunction(): Int = 42

  def aParameterlessFunc: Int = 42

  def aParameterlessFuncThatTakesUnit: () => Int = () => 42

  def aParameterless(unit: Unit): Int = 42

  def aRepeatedFunction(str: String, int: Int): String = if int > 0 then str * int else str

  def repeatStringRecursively(str: String, n: Int): String =
    if n <= 0 then str
    else str + repeatStringRecursively(str, n - 1)

  def repeatStringTailRecursively(str: String, n: Int): String =

    @tailrec
    def loop(string: String, int: Int, accumulatedString: String): String =
      if int <= 0 then accumulatedString
      else loop(string, int - 1, string + accumulatedString)

    loop(str, n, "")

  def tailRecursiveJoin(str: String, times: Int): String =

    @tailrec
    def go(eachString: String, nTimes: Int, accumulatedString: String): String =
      if nTimes <= 0 then accumulatedString
      else go(eachString, nTimes - 1, accumulatedString + eachString)

    go(str, times, "")

  def tailRecursiveSum(from: Int, to: Int): Int =

    @tailrec
    def go(start: Int, end: Int, accumulated: Int): Int =
      if start > end then accumulated
      else go(start + 1, end, accumulated + start)

    go(from, to, 0)

  def tailRecursiveProduct(from: Int, to: Int): Int =

    @tailrec
    def go(from: Int, to: Int, accumulated: Int): Int =
      if from > to then accumulated
      else go(from + 1, to, accumulated * from)

    go(from, to, 1)

  def tailRecursiveFactorial(n: Int): Int =

    @tailrec
    def go(n: Int, accumulated: Int): Int =
      if n == 1 then accumulated
      else go(n - 1, accumulated * n)

    go(n, 1)

  def tailRecursiveExists(numbers: Seq[Int], number: Int): Boolean =

    @tailrec
    def go(numbers: Seq[Int], number: Int): Boolean =
      if numbers.head == number then true
      else if numbers.tail == Nil then false
      else go(numbers.tail, number)

    go(numbers, number)

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

}
