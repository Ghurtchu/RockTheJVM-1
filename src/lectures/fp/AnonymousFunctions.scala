package lectures.fp

object AnonymousFunctions extends App {

  val doubler = new Function1[Int, Int] {
    override def apply(x: Int) = x * 2
  }
                          // implementation
  val doublerAnonymous = (x: Int) => x * 2
                          // type      // implementation
  val doublerAnonymous2: Int => Int = n => n * 2
  val doub: Int => Int = n => 2 * n

  println(doublerAnonymous(2))
  println(doublerAnonymous2(2))
  println(doub(2))

  // no params
  val something = () => 3
  val something2: () => Int = () => 5

  val func = new Function1[Unit, Int] {
    override def apply(v1: Unit): Int = 3
  }

  println(something)
  println(something())
  println(something2())
  println(func(()))

  val incrementer: Int => Int = _ + 1 // nicer way in order to shorten notation

  val niceAdder: (Int, Int) => Int = _ + _ // extremely contextual

  println(niceAdder(50, 50))

  List(1, 2, 3)
    .map(_ * 2)
    .filter(_ > 2)
    .foreach(println)
  
}
