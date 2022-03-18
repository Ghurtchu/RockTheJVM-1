package lectures.part3sequences

object TuplesAndMaps extends App {

  // tuples - finite ordered groupings of data
  val aTuple: (Int, String) = Tuple2(1, "Hello, Scala")
  println(aTuple._1) // second element
  println(aTuple.copy(_2 = "goodbye java"))
  println(aTuple.swap)

  // Maps - associative array, key -> value mapping

  val aMap: Map[String, Int] = Map()

  val phoneBook: Map[String, String] = Map(
    ("Jim", "555-555-555"),
    ("Coco", "123-333-555"),
    ("Nika", "555-666-444"),
    "Danny" -> "555-322-777") // syntactic sugar for tuples
    .withDefaultValue("")
  private val maybeString: Option[String] = phoneBook.get("coco")
  println(maybeString.orElse(Option("xd")))

  println(phoneBook("Coco"))
  println(phoneBook("Mary"))

  val newPairing = "Mary" -> "999"
  val newPhoneBook = phoneBook + newPairing

  val anotherPairing: (String, String) = ("John", "1000")
  val newerPhoneBook = newPhoneBook + anotherPairing

  println(newPhoneBook)
  println(newerPhoneBook)

  println(newerPhoneBook.map(pair => pair._1.toLowerCase -> pair._2 * 2))

  println(newerPhoneBook.keys.filter(key => key.startsWith("J")))

  println(newerPhoneBook.values.map(_ * 2))

  // conversions
  println(phoneBook.toList) // list of tuples
  println(List("Danny" -> 5, "Nika" -> 2).toMap)

  val names: List[String] = List("Bob", "Nick", "Helen", "Annie")

  println(names.groupBy(name => name.charAt(0)))
}
