package lectures.part2oop

object Inheritance extends App {

  // scala supports single class inheritance
  class Animal {
    val creatureType = "wild"
    protected def eat(): Unit = println("nomnom")
  }

  class Cat extends Animal {
    override def eat(): Unit = println("overriden cat")
    def crunch(): Unit = {
      eat()
      println("crunch crunch")
      eat()
    }
  }

  val cat = new Cat()
  cat.eat()

  // constructors

  class Person(val name: String, val age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, val idCard: String) extends Person(name)

  // overriding
  class Dog extends Animal {

    override val creatureType: String = "domestic"

    override def eat(): Unit = {
      println("eaaaaatiiiiiiiiiing")
      super.eat()
    }
  }

  val dog = new Dog
  dog.eat()
  println(dog.creatureType)

  // preventing overrides
  // 1 - use "final" keyword
  // 2 - use "sealed" keyword

 }
