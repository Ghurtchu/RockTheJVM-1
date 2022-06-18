package lectures.part3fp

object Sequences extends App {

  // type = Seq

  val aSequence: Seq[Int] = Seq(1, 2, 3, 5, 4) // Seq companion can construct subclasses for sequence such as List
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2)) // get number at index 2

  println(aSequence ++ Seq(5, 6, 7))
  println(aSequence.sorted)

  // Ranges
  val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println)

  (1 to 10).foreach(x => println("Hello"))

  // lists -- linear seq immutable linked list (head, tail, isEmpty - constant time operations)
  val aList = List(1, 2, 3)
  val prependedList = 42 :: aList // add to the head
  val prependedList2 = 42 +: aList // add to the head, same functionality
  println(prependedList)
  println(prependedList2)

  val appended = aList :+ 55
  println(appended)

  val apples5 = List.fill(5)("apple")
  println(apples5)

  println(aList.mkString("-"))

  // arrays - can be mutated, interoperable with java arrays, indexing is fast

  val numbers: Array[Int] = Array(1, 2, 3 ,4)
  val threeElems = Array.ofDim[Int](3)
  // initialized with default values = 0
  threeElems(0) = 1
  threeElems(1) = 10
  threeElems(2) = 100

  threeElems.foreach(println)
  threeElems(1) = 5000

  threeElems.foreach(println)

  // arrays and sequences
  val numbersSeq: Seq[Int] = numbers // numbers is of type Array, this is implicit conversion

  // vectors
  val vector: Vector[Int] = Vector(1, 2, 3)
  println(vector)



}
