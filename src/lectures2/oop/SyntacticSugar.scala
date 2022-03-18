package lectures2.oop

import scala.language.postfixOps

object SyntacticSugar extends App:

  // make name member by adding "val" to it
  class Person(val name: String, favoriteMovie: String):
    def likes(movie: String): Boolean = this.favoriteMovie == movie
    def hangoutWith(other: Person) =
      s"${this.name} is hanging out with ${other.name}, they are watching $favoriteMovie"
    def unary_! : String = "!"
    def isAlive: Boolean = true
    def isDead(): Boolean = !isAlive
    def apply(): String = s"Hi! my name is $name and I like $favoriteMovie"

  val likes: Boolean = new Person("xd", "mov").likes("mov")
  println(likes)

  val p = new Person(
    "xd",
    "the movieeeeeeeee"
  )

  // examples of syntactic sugar - nicer ways to writing code

  println(p likes "mov") // "likes" acts like an operator

  println(p hangoutWith new Person("Gela", "movie"))

  println(1 + 2)
  println(1.+(2))

  // unary operators
  val x = -1
  val y = 1.unary_- // they are equivalent

  val a = +(-1)
  val b = 1.unary_-.unary_+

  println(!p)
  println(p.unary_!)

  // postfix notation

  println(p.isAlive)
  // rarely used in practice
  println(p isAlive)

  println(p.isDead())

  println(p.apply())
  println(p())








