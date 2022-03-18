package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = favoriteMovie == movie
    def hangsOutWith(p: Person): String = s"$name is hanging out with ${p.name}"
    def unary_! : String = s"$name, what the heck?!"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1 )
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def +(str: String): Person = new Person(s"$name ($str)", favoriteMovie)
    def learn(thingToLearn: String) = s"$name is learning $thingToLearn"
    def learnsScala(): String = learn("Scala")
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  // infix/operator notation, only with single parameter methods like (syntactic sugar)
  // obj.methodName(param) -> obj methodName param
  println(mary likes "Inception") // equivalent as mary.likes("Inception")

  // "Operators" in scala
  // method acts like an "operator" between two things yielding the third thing
  // "+" or "$" might be used as method names
  val tom = new Person("Tom", "Fight Club")
  println(mary hangsOutWith tom)

  // ex
  println(1.+(2))
  // ALL OPERATORS ARE METHODS ON OBJECTS
  // Akka actors have operators like: ! ? etc

  // prefix notation = unary operators
  val x = -1 // same as 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with a few operators (-, +, ~ and !)

  println(mary.unary_!)
  println(!mary)

  // postfix notation => available for methods with 0 params
  println(mary.isAlive) // ofter used in practice
  println(mary isAlive) // postfix notation can introduce potential ambiguities

  // apply - special method name, has a special property
  println(mary.apply())
  println(mary()) // same effect as mary.apply(), call mary as if it was a function
  // if object is called as if it was a function then the apply() method is called
  // on that object implicitly

  println(mary.+("rockstar")())
  val maryGrown: Person = +mary
  print(maryGrown.age)
  println(maryGrown.learn("Scala"))
  println(maryGrown.learnsScala())
}
