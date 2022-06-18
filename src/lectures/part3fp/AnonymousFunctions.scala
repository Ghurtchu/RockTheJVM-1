package lectures.part3fp

object AnonymousFunctions extends scala.App {

  val doubler: Int => Int = _ * 2

  // multiple params
  val adder: (Int, Int) => Int = _ + _

  // no params
  val doSomething: () => Int = () => 3

  // curly braces with lambdas
  val strToInt: String => Int = { str =>
    str.toInt
  }

  assert(strToInt("3") == 3)
}
