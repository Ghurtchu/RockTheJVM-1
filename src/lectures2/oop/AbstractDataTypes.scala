package lectures2.oop

object AbstractDataTypes {

  def main(args: Array[String]): Unit =

    val croc: Carnivore = new Crocodile("crocodile")
    croc.eat(new Crocodile("croccie"))

  abstract class Animal(val creatureType: String):
    val animalType: String
    val nonAbstractMember: String = "non ambstract member"
    def eat(): Unit

  class Dog(override val creatureType: String, val name: String) extends Animal(creatureType):
    override val animalType: String = "Doggie"
    override def eat(): Unit = println("dog is eating...")

  trait Carnivore:
    def eat(animal: Animal): Unit
    val instanceMember: Int = 55
    // traits don't have constructor parameters
  
  class Crocodile(override val creatureType: String) extends Animal(creatureType) with Carnivore:
    override val animalType: String = "croccie"
    override def eat(animal: Animal): Unit = println(s"crocodile is eating ${animal.creatureType}")
    override def eat(): Unit = println(s"$animalType is eating something..")
}
