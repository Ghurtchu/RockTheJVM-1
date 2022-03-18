package lectures.part2oop

object OOPBasics extends App {

  val person: Person = Person("Anzor", 22)
  println(person.age)
  println(person.name)
  person.greet("zuzu")
  person.greet()

}

// constructor
// write val or val before params if you wanna turn them into instance fields
class Person(var name: String, var age: Int = 0) { // default params

  // field
  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading, methods => same name, different signatures
  def greet(): Unit = println(s"${this.name} says: Hi, $name")

  // multiple constructors are allowed
  def this(name: String) = this(name, 0)
  def this(age: Int) = this("", age)
  def this() = this("", 0)
}
