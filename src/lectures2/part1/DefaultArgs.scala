package lectures2.part1

object DefaultArgs extends App :

  def factorial(n: Int): Int =

    @annotation.tailrec
    def go(n: Int, accumulated: Int = 1): Int =
      if n <= 1 then accumulated
      else go(n - 1, accumulated * n)

    go(n)

  println(factorial(5))
  println(factorial(6))
  println(factorial(7))


  def savePicture(format: String = "jpg", width: Int = 1000, height: Int = 800): Unit =
    println("saving...")

  // named parameters if you want to only provide arguments for some parameters
  savePicture(width = 34)
  savePicture(width = 35, format = "d")
  savePicture(height = 35, format = "d")

  def savePic(width: Int, height: Int, format: String = "jpg"): Unit =
    println("saving...")

  savePic(5, 5)
  savePic(5, 5, "lmao")
