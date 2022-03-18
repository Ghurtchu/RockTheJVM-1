package lectures2.oop


// SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY SUCH AS ("STATIC")

object Objects extends App:

  println(Person.N_EYES)
  println(Person.canFly)

  val mary = Person
  val john = Person
  println(john == mary) // refer to the same instance

  val p1 = new Person("p1")
  val p2 = new Person("p2")
  println(p1 == p2) // refer to the different instances

  val maryJohn = Person(new Person("Mary"), new Person("John"))
  println(maryJohn.name)

  // this is a singleton instance
  object Person:
    // here goes class (static) level functionality
    val N_EYES = 2 // same as public static final int = 2
    def canFly: Boolean = true // same as public static boolean canFly() { return true; }

    // factory method
    def apply(mother: Person, father: Person): Person = new Person(mother.name concat father.name)

  class Person(val name: String)
    // class Person and object Person are called companions
    // here goes instance level functionality

