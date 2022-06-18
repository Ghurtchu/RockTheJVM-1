package lectures.part3fp

object Options extends App {
  // An option is a wrapper for a value that might be present or not (Some(val) or None)

  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  println(myFirstOption)
  println(noOption.isEmpty)

  // unsafe APIS
  def unsafeMethod(): String = null
  val result = Some(unsafeMethod()) // WRONG, cause Some(null) which breaks the whole point of Options

  println(unsafeMethod())

  println(myFirstOption.isEmpty)
  println(myFirstOption.get)

  println(myFirstOption.map(_ * 2)) // duplicates inside Some()
  println(myFirstOption.filter(x => x > 10))
  println(myFirstOption.flatMap(x => Option(x * 10)))

  // for comprehensions
  val config: Map[String, String] = Map (
    // fetched from elsewhere, thereby is not local
    "host" -> "176.45.36.1",
    "port" -> "80"
  )

  class Connection {
    def connect = "Connected" // connect to some server/ TCP/IP
  }

  object Connection {
    val random = new java.util.Random(System.nanoTime())
    def apply(host: String, port: String): Option[Connection] = {
      if (random.nextBoolean()) Some (new Connection)
      else None
    }
  }

  val host: Option[String] = config.get("host")
  val port: Option[String] = config.get("port")

  val connection: Option[Connection] = host.flatMap(h => port.flatMap(p => Connection.apply(h, p)))
  val connectionStatus: Option[String] = connection.map(c => c.connect)
  connectionStatus.foreach(println)
//
//  config.get("host")
//    .flatMap(host => config.get("port"))
//    .flatMap(port => Connection(host, port))
//    .map(_.connect)
//    .foreach(println)


}
