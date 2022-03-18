package lectures3.part1basics.recursion

import scala.annotation.tailrec

object Recursion extends App {

  println(factorial(5))
  println(anotherFactorial(5))

  def factorial(n: Int): Int =
    if n <= 1 then 1
    else {
      println(s"computing factorial of $n BUT I first need factorial of ${n - 1}")
      val result: Int = n * factorial(n - 1)
      println(s"computed factorial of $n, it is $result")
      result
    }

  def anotherFactorial(n: Int): Int =
    @tailrec
    def factHelper(n: Int, accumulated: Int): Int =
      if n <= 1 then accumulated
      else factHelper(n - 1, accumulated * n)

    factHelper(n, 1)
}
