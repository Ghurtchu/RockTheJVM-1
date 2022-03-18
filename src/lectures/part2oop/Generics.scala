package lectures.part2oop

object Generics extends App {

  class MyList[A] {
    // use the type A
  }

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

}
