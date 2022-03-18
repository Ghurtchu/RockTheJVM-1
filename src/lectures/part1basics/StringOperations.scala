package lectures.part1basics

object StringOperations extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(0))
  println(str.charAt(1))
  println(str.charAt(2))
  println(str.substring(1, 6))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace("Hello", "LMAO"))
  println(str.toLowerCase)
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
        // prepend            append
  println("a" +: aNumberString :+ 'z')

  println(str.reverse)
  println(str.take(2))



}
