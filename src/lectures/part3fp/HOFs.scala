package lectures.part3fp

object HOFs extends scala.App {

//  val superFunc: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = ???

  // realistic examples are: map, flatMap and filter on list data structure

  def nTimes(f: Int => Int)(arg: Int)(times: Int): Int = {
    if times <= 1 then f(arg)
    else nTimes(f)(f(arg))(times - 1)
  }

  assert(nTimes(_ + 1)(0)(5) == 5)
  assert(nTimes(_ * 2)(1)(1) == 2)
}
