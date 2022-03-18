package lectures.fp

object Currying extends App {

  def superSummer: Function2[Int, Int, Function1[Int, Int]] = new Function2[Int, Int, Function1[Int, Int]] {
    override def apply(a: Int, b: Int) = {
      new Function1[Int, Int] {
        override def apply(inner: Int) = {
          a + b + inner
        }
      }
    }
  }

  val addTo5 = superSummer(2, 3)
  val result = addTo5(10) // should be 15

  println(superSummer(1, 2)(3))
  println(result)

}
