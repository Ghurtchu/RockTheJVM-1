package lectures2.part1

object Recursion extends App :

  // each call of factorial(_) uses the new stack frame
  def factorial(n: Int): Int =
    if (n <= 1) then {
      println("computed!")
      1
    }
    else {
      Thread.sleep(250)
      println("computing factorial...")
      println(s"first I need to compute fact(${n - 1})")
      val result = n * factorial(n - 1)
      result
    }

  val res: Int = factorial(5)
  println(s"the result is $res")

  val res1: Int = factorial(10)
  println(s"the result is $res1")

  val res2: Int = factorial(20)
  println(s"the result is $res2")

  def tailRecursiveFactorial(n: Int): Int =

    @annotation.tailrec
    def go(n: Int, accumulated: Int): Int =
      if n < 1 then accumulated
      else go(n - 1, accumulated * n)

    go(n, 1)

  println(tailRecursiveFactorial(5))
  println(tailRecursiveFactorial(2))
  println(tailRecursiveFactorial(10))
