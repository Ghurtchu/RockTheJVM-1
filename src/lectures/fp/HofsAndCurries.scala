package lectures.fp

object HofsAndCurries extends App {

  def nTimes(f: Int => Int, n: Int, x: Int): Int = {
    if (n <= 0) then x
    else nTimes(f, n - 1, f(x))
  }

  def superAdder: Int => (Int => Int) = (a: Int) => (b: Int) => a + b

  val addTo10: Int => Int = superAdder(10)
  println(addTo10(20))

  def curriedFormatter(c: String)(x:Double): String = c.format(x)

  val standardFormat: Double => String = curriedFormatter("%4.2f")
  val preciseFormat: Double => String = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))

}
