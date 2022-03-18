package lectures.part4patternmatching

object PMExamples extends App {

  // 1 - constants
  val x: Any = "Scala"

  val constants = x match {
    case 1 => "a number"
    case "Scala" => "THE SCALA"
    case true => "Boolean :)"
    case PMExamples => "hehe"
  }

  // 2 - match anything
  // 2.1 wildcard

  val matchAnything = x match {
    case _ => "default"
  }

  // 2.2 variable
  val matchVariable = x match {
    case something => s"I've found $something"
  }

  // tuples
  val aTuple = (1, 2)
  val matchATuple = aTuple match {
    case (1, 2) => true
    case (3, 3) => false
    case _ => false
  }

  val nestedTuple = (1, (2, 3))
  val matchANested = nestedTuple match {
    case (_, (_, _)) => true
    case _ => false
  }


}
