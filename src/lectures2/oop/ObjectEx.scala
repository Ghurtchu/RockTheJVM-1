package lectures2.oop

object ObjectEx {
  def main(args: Array[String]): Unit =

    val p: Person = Person("Anzor")
    println(p)


  class Person private(val name: String):
    override def toString: String = s"I am $name"

  object Person:
    def apply(name: String): Person = new Person(name)
}
