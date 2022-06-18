package lectures.part3fp

object WhatsAFunction extends scala.App {

  val doubler = new MyFunction[Int, Int]:
    override def apply(a: Int): Int = a * 2

  val doublerSyntaxSugar: Int => Int = _ * 2

  assert(doubler(2) == 4)
  assert(doublerSyntaxSugar(2) == 4)

  val increment: Int => Int = new Function1[Int, Int] {
    override def apply(v1: Int): Int = v1 + 1
  }

  val incrementSyntaxSugar: Int => Int = _ + 1

  assert(increment(5) == 6)
  assert(incrementSyntaxSugar(5) == 6)

  val adder: (Int, Int) => Int = new Function2[Int, Int, Int]:
    override def apply(v1: Int, v2: Int): Int = v1 + v2

  val adderSyntaxSugar: (Int, Int) => Int = _ + _

  assert(adder(1, 1) == 2)
  assert(adderSyntaxSugar(1, 1) == 2)

  import exercises._

  assert(concatenator("Scala", "Rocks") == "ScalaRocks")

  object exercises {

    // 1
    val concatenator: (String, String) => String = _ concat _

    // 3
    val f: Int => (Int => Int) = a => (b => (a + b))
    println(f(5)(10))

  }

}

trait MyFunction[A, B] {
  def apply(a: A): B
}
