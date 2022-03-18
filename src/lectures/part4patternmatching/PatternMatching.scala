//package lectures.part4patternmatching
//
//import lectures.part1basics.Expressions
//
//import scala.util.Random
//
//object PatternMatching extends App {
//
//  // swtich on steroids
//  val random = new Random()
//  val x = random.nextInt(10)
//
//  val description = x match {
//    case 1 => "The one"
//    case 2 => "double or nothing"
//    case 3 => "the god's number"
//    case _ => "xd"
//  }
//
//  // 1. decompose values
//
//  case class Person(name: String, age: Int)
//
//  val bob = Person("Bob", 20)
//
//  val greeting = bob match {
//    case Person(n, a) if a < 21 => s"Hi, my nae is $n and I am $a years old and I can't drink"
//    case Person(n, a) => s"Hi, my nae is $n and I am $a years old"
//    case _ => "I don't know what's going on here"
//  }
//
//  println(greeting)
//
//  // 1. cases are matched in order (from top to bottom)
//  // 2. what if no cases match? MatchError
//  // 3. type of PM expression? unification of returned expressions ^ string
//  // 4. PM works really well with case classes
//
//  // PM on sealed hierarchies
//
//  sealed class Animal
//  case class Dog(breed: String) extends Animal
//  case class Parrot(greeting: String) extends Animal
//
//  val animal: Animal = new Dog("Chihuahua")
//
//  animal match {
//    case Dog(someBreed) => println(s"Matched a dog of the $someBreed")
//  }
//
//  val isEven = x match {
//    case n if n % 2 == 0 => true
//    case _ => false
//  }
//
//  def isEvenCond(n: Int): Boolean = n % 2 == 0
//
//  trait Expr
//  case class Number(n: Int) extends Expr
//  case class Sum(e1: Expr, e2: Expr) extends Expr
//  case class Product(e1: Expr, e2: Expr) extends Expr
//
//  // a function that uses PM
//  // and takes an expression as parameter
//  // and returns human readable form of it
//  // Sum(Number(2), Number(3)) => 2 + 3
//
//  def show(e: Expr): String = e match {
//    case Number(n) => s"$n"
//    case Sum(e1, e2) => show(e1) concat show(e2)
//    case Product(e1, e2) => {
//      def maybeShowParentheses(expr: Expr) = expr match {
//        case Prod(_, _) => show(expr)
//        case Number(_) => show(expr)
//        case _ => "(" concat show(expr) concat ")"
//      }
//
//      maybeShowParentheses(e1) concat " " concat maybeShowParentheses(e2)
//    }
//
//  }
//
//}
