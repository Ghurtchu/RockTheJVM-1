package lectures.part2oop

// object functionality is not tied to "instances" of classes
// they may be thought as static functions in Java
object ScalaObjects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY (does not know "static")
  // but it has something better, object!

  object Person { // define its' type and its' only instance
    // class level functionality
    val N_EYES: Int = 2
    def canFly: Boolean = false
    // factory method - build persons given some parameters
    def apply(mom: Person, dad: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {
    // instance level functionality (write class separately)
    // regular instance
  }

  println(Person.N_EYES)
  println(Person.canFly)
1
  // scala object is a "singleton" instance by definition
//  val mary = Person
//  val john = Person
//  println(john == mary) // point to the same instance

  val mary = new Person("Mary")
  val john = new Person("John")
  val bobbie = Person.apply(mary, john)
  println(bobbie.name)

  // Scala application = Scala object with
  // def main(args: Array[String]): Unit = {}

}
