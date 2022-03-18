package lectures.fp

object MapFlatmapFilter extends App {

  val list = List(1, 2, 3) // same as List.apply() on List companion object
  println(list)
  println(list.head)
  println(list.tail)

  println(list.map(_ + 1)) // increment each
  println(list.map(_ * 2)) // double each

  println(list.filter(_ % 2 == 0))

  val toPair: Int => List[Int] = x => List(x, x + 1)
  println(list.flatMap(x => List(x, x + 1)))
  println(list.flatMap(toPair))

  // print out of all combinations of two lists
  val l1: List[Int] = List(1, 2, 3, 4, 5)
  val l2: List[Int] = List(5, 4, 3, 2, 1)

  l1.foreach(outer => l2.foreach(inner => println(s"inner=$inner, outer=$outer")))
  private val value: List[Int] = l1.flatMap(outer => l2.flatMap(inner => List(outer, inner)))
  println(value)

  val nums = List(1, 2, 3)
  val chars = List('a', 'b', 'c')
  // desired output a1, a2, a3, b1, b2 ... c3

  val combined: List[String] = nums.flatMap(num => chars.map(char => num.toString + char))
  println(combined)

  println(chars.flatMap(char => nums.map(num => num.toString + char)))

  // for comprehensions with filters
  val forCombinations = for {
    n <- nums if n % 2 != 0
    c <- chars if c != 'a'
  } yield n.toString + c

  println(forCombinations)

  for n <- nums do println(n)

  for n <- nums do {
    println(n)
  }

  list.map {
    x => x * 2
  }

  

}
