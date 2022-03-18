package lectures3.part1basics.functions

import scala.annotation.tailrec

object Exercises extends App {

  println(Solutions fibonacci 5) // 1 1 2 3 5 8
  println(Solutions fibonacci 6) // 1 1 2 3 5 8
  println(Solutions.greet("soso", 15))
  println(Solutions factorial 5)
  println(Solutions tailRecursiveFactorial  5)

}

object Solutions:

  def greet(name: String, age: Int): String = s"Hi, my name is ${name.capitalize} and I am $age years old"

  def factorial(n: Int): Int =
    if n <= 1 then 1
    else n * factorial(n - 1)

  def fibonacci(n: Int): Int =
    if n <= 2 then 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  def tailRecursiveFactorial(n: Int): Int =
    @tailrec
    def go(n: Int, accumulated: Int): Int =
      if n <= 1 then accumulated
      else go(n - 1, n * accumulated)
    go(n, 1)