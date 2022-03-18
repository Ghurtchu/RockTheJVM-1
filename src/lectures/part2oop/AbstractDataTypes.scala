package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract classes can not be instantiated

  abstract class Animal {
    val creatureType: String
    def eat(): Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Dog"
    override def eat(): Unit = println("crunch crunch")
  }

  val animal: Animal = new Dog()
  animal.eat()

  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "Crocodile"
    override def eat(): Unit = println("xd")
    override def eat(animal: Animal) = println(s"I am a croc and I'm eating ${animal.creatureType}")
  }

  val croc: Carnivore = new Crocodile()
  croc.eat(new Dog())

}
