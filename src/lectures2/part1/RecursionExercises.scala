package lectures2.part1

object RecursionExercises extends App :

  // 1. concatenate
  // 2. is prime
  // 3. fibo

  // 1
  def concatenate(s: String, times: Int): String =

    @annotation.tailrec
    def go(string: String, n: Int, accumulated: String): String =
      if n == 0 then accumulated
      else go(string, n - 1, accumulated concat string)

    go(s, times, "")

  println(concatenate("string ", 5))


  // 2
  def isPrime(n: Int): Boolean =

    @annotation.tailrec
    def go(n: Int, lower: Int): Boolean =
      if lower == 1 then true
      else if n % lower == 0 then false
      else go(n, lower - 1)

    go(n, n - 1)

  println(isPrime(5)) // true
  println(isPrime(4)) // false
  println(isPrime(15)) // true
  println(isPrime(17)) // false

  // 3
  def fibonacci(n: Int): Int =

    @annotation.tailrec
    def go(n: Int, prev: Int, current: Int): Int =
      if n <= 1 then current
      else go(n - 1, prev = prev + current, current = prev)

    go(n, 1, 0)

  println(fibonacci(5)) // 0, 1, 1, 2, 3
  println(fibonacci(7))
