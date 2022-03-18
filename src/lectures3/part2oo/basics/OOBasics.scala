package lectures3.part2oo.basics

object OOBasics extends App {

  val person = new Person("gogo", 5)
  println(person)

  println(person greet "Martha")
}

// this is a primary constructor for Person class
class Person(val name: String, val age: Int):
  // instance field
  val x = 2

  // expressions
  println("what? :))")

  def this(name: String) = this(name, 0)

  def greet(name: String): String = s"Hi! My name is ${this.name}, and you're probably... $name?!"