package lectures3.part1basics.first

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  val s = "string" // compiled can infer types, same as val s: String = "string"
  println(s)

  val b: Boolean | Int = 2 + true
  println(b)

  val c: Char = 'a'
  val i: Int = 4
  val sh: Short = 2
  val l: Long = 10L
  val f: Float = 23.3
  val d: Double = 1235.32

  // vals can not be reassignedw

  var aVar: Int = 5 // can be reassigned (var)
  aVar += 5
}

extension (x: Int)
  def +(b: Boolean): Int = if b then x + 1 else x
