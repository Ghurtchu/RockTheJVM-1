package lectures2.oop

import scala.util.Try

object Exceptions extends App:

//  val nothing: Nothing = throw new NullPointerException
//
  // catch exceptions

  private val number: Int = try {
    getInt(true)
  } catch {
    case e: RuntimeException => DefaultValue.defaultValue
  } finally {
    println("this will always run")
  }

  println(5)


  def getInt(withExceptions: Boolean): Int =
    if withExceptions then throw new RuntimeException("lmao")
    else (Math.random() * 10).toInt


object MyException:
  class MyException extends Exception
  val instance: MyException = new MyException

object DefaultValue:
  val defaultValue: Int = 5