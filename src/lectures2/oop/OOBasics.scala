package lectures2.oop

object OOBasics extends App {

  val p: Person = new Person("Nika", 22) // instantiated a class object

  println(p.age)
  println(p.name)
  println(p.introduceSelf)

  println(new Person("guga", 55).introduceSelf)

  println(p.greetOther("Xatuna"))
  println(p.greet)

  println(p.x)
  println(p.y)


}

// in order to make params class members u gonna do the following
// add var/val before param
class Person(val name: String, val age: Int): // constructor, class params are not fields

  // body
  // val and var definitions
  val x = 2 // field
  var y = 4 // field

  // function definitions (methods)
  def introduceSelf: String = s"I am $name and I am $age years old"

  def greetOther(name: String) = s"Hi $name! my name is ${this.name}"

  def greet: String = s"Hi! my name is $name"

  // expressions
  println("it will always run first while creating oject")
  // this will always be evaluated while instantiating object

  // multiple constructors

  def this(name: String) = {
    this(name, 0)
    println("default age = 0")
  }
  def this(age: Int) = {
    this("", 0)
    println("default name = ''")
  }

  def this() = this("")