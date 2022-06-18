//package lectures.part3sequences
//
//import java.util.Random
//import scala.util.Failure
//import scala.util.Success
//import scala.util.Try
//
//object HandlingFailure extends App {
//
//  val aSuccess = Success(3)
//  val aFailure = Failure(new RuntimeException("SUPER FAILURE"))
//
//  println(aSuccess)
//  println(aFailure)
//
//  def unsafeMethod(): String = throw new RuntimeException("NO STRING FOR YOU BUSTER")
//
//  val potentialFailure = Try(unsafeMethod())
//  println(potentialFailure)
//
//  // syntax sugar
//  val anotherPotentialFailure = Try {
//    unsafeMethod()
//  }
//
//  // utilities
//  println(potentialFailure.isSuccess)
//
//  def backupMethod(): String = "A valid result"
//  val fallbackTry = Try(unsafeMethod()).orElse(Try(backupMethod()))
//  println(fallbackTry)
//
//  // If you design the API
//  // wrap your computations in the Try() instead
//
//  def betterUnsafeMethod(): Try[String] = Failure(new RuntimeException)
//  def betterBackupMethod(): Try[String] = Success("Valid result, 200!")
//
//  val betterFallback = betterUnsafeMethod() orElse betterBackupMethod()
//  println(betterFallback)
//
//  // map, flatMap, filter on Try()
//
//  println(aSuccess.map(_ * 2))
//  println(aSuccess.flatMap(x => Success(x * 10)))
//  println(aSuccess.filter(_ > 10))
//
//  val hostName: String = "localhost"
//  val port: String = "8080" // for http
//
//  def renderHTML(page: String) = println(page)
//
//  class Connection {
//    def get(url: String): String = {
//      val random: Random = new java.util.Random(System.nanoTime())
//      if random.nextBoolean() then "<html> ... </html>"
//      else throw new RuntimeException("Connection interrupted")
//    }
//
//    def getSafe(url: String): Try[String]= Try(get())
//  }
//
//  object HttpService {
//    val random: Random = new java.util.Random(System.nanoTime())
//    def getConnection(host: String, port: String): Connection = {
//      if random.nextBoolean() then new Connection
//      else throw new RuntimeException("HttpService is down")
//    }
//
//    def getSafeConnection(host: String, port: String): Try[Connection] = Try(getConnection(host, port))
//
//  }
////
////  val possibleConnection = HttpService.getSafeConnection(hostName, port)
////  val possibleHTML = possibleConnection
////    .flatMap(connection => connection.getSafe("/home"))
////  possibleHTML.foreach(renderHTML)
//
//}
