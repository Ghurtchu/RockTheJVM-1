package lectures.part1basics

import scala.annotation.tailrec

object StackAndTailRecursion extends App {

  def factorial: Int => Int = n => {
    if n <= 1 then 1
    else {
      println(s"computing factorial of $n I first need factorial of ${n - 1}")
      val result: Int = n * factorial(n - 1)
      println(s"computed factorial of ${n - 1}")
      result
    }
  }

  factorial(5) // stack has limited memory
  // factorial(5000) // stack has limited memory => StackOverFlow, recursive depth is too big

  def tailRecursiveFactorial: Int => BigInt = n => {
    def loop: (Int, BigInt) => BigInt = (n, accumulator) => {
      if n <= 1 then accumulator
      else loop(n - 1, n * accumulator)
    }
    loop(n, 1) // preserve the stack frame, not use another stack frame
  }

  def xd: (Int, BigInt) => BigInt = (end, accumulated) => {
    if end <= 1 then accumulated
    else xd(end - 1, accumulated * end)
  }

  println(tailRecursiveFactorial(5))
  println(tailRecursiveFactorial(500))

  println(xd(100, 1))

  // when you need loops, use tail recursion

  // 1. string concatenation function using tail recursion
  // 2. fibonacci with tail recursion

  // 1.
  def concat: (String, Int) => String = (s, n) => {
    def loop: (String, Int) => String = (concatenated, n) => {
      if n == 1 then concatenated
      else loop(s + concatenated, n - 1)
    }
    loop(s, n)
  }

  @tailrec
  def tailRecConcat(str: String, no: Int, accum: String): String = {
    if no <= 0 then accum
    else tailRecConcat(str, no - 1, str + accum)
  }

  println(tailRecConcat("str", 5, ""))

  println(concat("str", 5))

  def fibo(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextLast: Int): Int = {
      if i <= 2 then 1
      else fiboTailRec(i + 1, last + nextLast, last)
    }
    fiboTailRec(5,1, 1 )
  }
}
