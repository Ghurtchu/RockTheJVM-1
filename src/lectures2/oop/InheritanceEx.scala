package lectures2.oop

object InheritanceEx {

  def main(args: Array[String]): Unit = {

    val adult: Person = new Adult("xatuna", 15, "Asdsad")
    val person: Person = new Person("Nekro", 55)

    println(adult.personType)
    println(person.personType)
    
  }

  class Person(val name: String, val age: Int):

    val personType: String = "introverted"

    def this(name: String) =
      this(name, 0)
      println("person constructor called")

    def this(age: Int) =
      this("", age)
      println("person constructor called")

    def this() =
      this("", 0)
      println("person constructor called")

    override def toString: String = s"I am $name and I am $age years old"

  class Adult(name: String, age: Int, idCard: String) extends Person(name, age):

    override val personType: String = "extroverted"

    override def toString: String = s"${super.toString} and my idCard is $idCard"

}
