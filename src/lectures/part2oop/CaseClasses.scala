package lectures.part2oop

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  val p = new Person("Nika", 55)
  println(p) // toString exists

}
