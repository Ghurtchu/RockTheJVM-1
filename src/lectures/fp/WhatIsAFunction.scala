package lectures.fp

object WhatIsAFunction extends App {

  // DREAM: use functions as first class elements
  // problem: oop

  println(new Action().execute(5))
  println(new Adder().apply(5))

  // create function
  def doubler = new MyFunction[Int, Int] {
    override def apply(a: Int): Int = a * 2
  }

  println(doubler(2))

  // function types = Function1, Function2 ... Function20
  val stringToIntConverter = new Function1[String, Int] {
    override def apply(v1: String): Int = v1.toInt
  }

  def concatenator: Function2[String, String, String] =
    new Function2[String, String, String] {
      override def apply(v1: String, v2: String): String = v1 concat v2
    }

  def concatenatorLambda: (String, String) => String = (a, b) => a concat b

  println(concatenator("str1", "str2"))
  println(concatenatorLambda("str1", "str2"))

  println(stringToIntConverter("1"))

  val adder: (Int, Int) => Int = (a, b) => a + b
  println(adder(5, 10))

  // ALL SCALA FUNCTIONS ARE OBJECTS, OR INSTANCES OF CLASSES DERIVING FORM
  // Function1, Function2 etc..

  val conc: (String, String) => String = (s1, s2) => s1 concat s2

  val conca: Function2[String, String, String] = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 concat v2
  }

  println(conca("s1", "s2"))

  def CONCATENATOR: Function2[String, String, String] = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 concat v2
  }

  println(CONCATENATOR("S 1", "S 2"))

}

class Action {
  def execute(n: Int): String = n.toString
}

trait MyFunction[A, B] {
  def apply(a: A): B
}

class Adder extends MyFunction[Int, Int] {
  def apply(a: Int): Int = a + 1
}
