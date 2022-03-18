package lectures2.part1

object StringOperationsExamples extends App :

  val str: String = "Hello, I am learning scala"

  println(str.take(2))
  println(str.takeRight(2))
  println(str.reverse)

  // raw interpolator
  println(raw"ra yle xdeba \n :))")
