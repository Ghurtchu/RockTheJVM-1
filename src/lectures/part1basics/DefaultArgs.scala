package lectures.part1basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int = {
    if n <= 1 then acc
    else trFact(n - 1, n * acc)
  }

  // same parameters 99% of the time (acc = 1)
  val fact10: Int = trFact(10, 1)
  val fact11: Int = trFact(11, 1)
  val fact12: Int = trFact(12, 1)

  val fact5: Int = trFact(10)
  println(fact5)

  def savePicture(format: String = "jpg", widht: Int, height: Int): Unit = println("saving pic")
  savePicture("jpg", 800, 600)
  savePicture(widht = 800, height = 600) // use named parameters if the first param has default value

  

}
