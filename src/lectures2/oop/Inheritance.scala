package lectures2.oop

// single inheritance

object Inheritance {

  def main(args: Array[String]): Unit = {

    val c: Animal = new Cat
    c.eat()

  }

  abstract class Animal extends Introduction {

    // public method
    def eat(): Unit =
      introduce
      println("nom nom")

    // private method only used in animal
    private def privateMethod(): Unit = println("accessed only in animal")


  }

  class Cat extends Animal {
    // overriding eat
    override def eat(): Unit =
      super.eat()
      println("I am cat")

    // implementing introduce
    override protected def introduce: String = "I'm cat!"
  }

  trait Introduction:
    protected def introduce: String

}

