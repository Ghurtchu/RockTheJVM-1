package lectures.part1basics

object Functions extends App {

  def sum(a: Int, b: Int): Int = a + b
  def jum: (Int, Int) => Int = (a, b) => a + b

  def aFunction(a: String, b: Int): String = {
    if a == "a" then sum(b, 1).toString else jum(b, -1).toString
  }

  println(aFunction("a", 5))
  println(aFunction("a", 6))
  println(aFunction("b", 6))

  // calling a function is also an expression like everything else in Scala

  def aParameterlessFunction: () => Int = () => 42

  println(aParameterlessFunction) // parameterless might be called without parentheses
  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, anInt: Int): String = aString * anInt

  println(aRepeatedFunction("str", 3))

  def recursiveRepetition(str: String, times: Int): String = {
    if times <= 1 then str // base case
    else str concat " " concat recursiveRepetition(str, times - 1) // recursive call
  }

  def tailRecursiveRepetition: (String, Int) => String = (str, times) => {
    def go: (String, Int) => String = (str, times) => {
      if times <= 1 then str
      else str concat " " concat go(str, times - 1)
    }
    go(str, times)
  }

  println(recursiveRepetition("string", 10))
  println(tailRecursiveRepetition("string", 10))

  // imperative = loop
  // declarative = recursion

  def factorial: (Int => Int) = n => {
    def loop: Int => Int = n => {
      if n <= 1 then 1
      else n * factorial(n - 1)
    }

    loop(n)
  }

  println(factorial(5))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString concat "xd")

  def aBigFunction: Int => Int = n => {
    def aLocalFunction: Int => Int = n => n + 1
    aLocalFunction(n + 1)
  }

  println(aBigFunction(10))

  // 1. A greeting function, ex: "Hi, my name is {name} and I am {age} years old
  // 2. Factorial function

  // 1
  def greet: (String, Int) => String = (name, age) => s"Hi, I am $name and I am $age years old"
  println(greet("Nika", 22))

  // 2
  println(factorial(5))

  def fibonacci: Int => Int = n => {
    def loop: Int => Int = n => {
      if n <= 2 then 1
      else loop(n - 1) + loop(n - 2)
    }
    loop(n)
  }

  println(fibonacci(5)) // 5
  println(fibonacci(6)) // 8
  println(fibonacci(7)) // 13

  def isPrime: Int => Boolean = n => {
    def isPrimeUntil: Int => Boolean = t => {
      if t <= 1 then true
      else n % t != 0 && isPrimeUntil(t - 1)
    }
    isPrimeUntil(n / 2)
  }

  println(isPrime(11))
}
