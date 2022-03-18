package lectures2.part1

import scala.annotation.tailrec

object FunctionsExercises extends App :

  // 1. A greeting function (name, age) => "Hi, my name is David and I'm 12 years old"
  def greeting(name: String, age: Int): String = s"Hi, my name is $name and I'm $age years old"

  println(greeting("Vazha", 15))

  // 2. write a factorial with tail recursion
  def factorial(n: Int): Int =

    def go(top: Int, accumulated: Int): Int =
      if top == 1 then accumulated
      else go(top - 1, top * accumulated)

    go(n, 1)

  println(factorial(5))

  // 3. fibonacci with tail recursion

  def fibonacci(n: Int): Int =
    @tailrec
    def go(n: Int, prev: Int, current: Int): Int =
      if n <= 0 then current
      else go(n - 1, prev = prev + current, current = prev)

    go(n, 1, 0)

  println(fibonacci(5))
  // 4. function that tests if the number is prime.

  def checkIfPrimeTailRecursively(n: Int): Boolean =

    @tailrec
    def go(n: Int, divisor: Int): Boolean =
      if divisor == 1 then false
      else if n % divisor == 0 then true
      else go(n, divisor - 1)

    go(n, n - 1)

  println(checkIfPrimeTailRecursively(5)) // false
  println(checkIfPrimeTailRecursively(10)) // true
  println(checkIfPrimeTailRecursively(11)) // false
  println(checkIfPrimeTailRecursively(15))
