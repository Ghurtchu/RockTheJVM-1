package lectures2.oop

import scala.language.postfixOps

object MethodNotationExercises extends App:

  // 1. overload + operator
  // mary + "rockstar" return new person with name "mary rockstar"

  // 2. add an age to the person class
  // add unary + operator => increments age returns new person

  // 3. learns method receives string returns
  // => "Mary learns {scala}"
  // add learnsScala that calls learns method with "Scala" as a param
  // use it in postfix notation

  // 4. overload apply method to receive number and return string
  // mary.apply(2) => "Mary watched her favorite movie 2 times"

  class Person(val name: String, val age: Int, val movie: String):

    def +(nickName: String): Person = new Person(s"$name $nickName", age, movie)
    def unary_+ : Person = new Person(name, age + 1, movie)
    def ++ : Person = unary_+
    def learns(topic: String): String = s"$name is learning $topic"
    def learnsScala: String = learns("Scala")
    def apply(n: Int): String = s"$name has watched $movie for $n times"

  val nika = new Person("Nika", 15, "Kill Ben Lyk")
  val enhancedNika = nika + "Scala Champion"

  val incrementedAgeNika: Person = +nika
  println(incrementedAgeNika.age)

  println((incrementedAgeNika ++).age)

  println((nika.unary_+).age)

  val learns: String = enhancedNika learns "xd"
  println(learns)
  println(enhancedNika learnsScala)
  println(nika(2))
  println(enhancedNika(4))