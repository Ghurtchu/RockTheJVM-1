package lectures.part2oop

object Exceptions extends scala.App {

  val x: String = null

  // println(x.length) // NullPointerException
  // tech terms: Throwing and Catching Exceptions

  // val aWeirdValue: Nothing = throw new RuntimeException

  // Throwable -> (1) Error / (2) Exception

  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No int for you") else 42

  def execute(withExc: Boolean): String =
    if (withExc) throw new NullPointerException("nulllllllll") else "success"

  try {
    getInt(true)
  } catch {
    case re: RuntimeException => println("caught error")
  } finally {
    println("Will always run")
  }

  try {
    execute(true)
  } catch {
    case npe: NullPointerException => println("caught that too")
  }

  class BoomException extends Exception {
    override def getMessage: String = "booooooom"
  }

  try {
    throw new BoomException
  } catch {
    case be: BoomException => println("not boom :)")
  }

}
