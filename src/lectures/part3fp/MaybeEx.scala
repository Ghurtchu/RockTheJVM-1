package lectures.part3fp

object MaybeEx extends scala.App {

  val e1 = Exists(5)
  val e2 = Exists(10)

  val res = for {
    e1val <- e1
    e2val <- e2
  } yield e1val + e2val

  println(res)

  println {
    for {
      e1 <- Exists(100) if e1 % 2 == 0
      e2 <- Exists(1) if e2 < 5
    } yield e1 + e2
  }

  println {
    for {
      e1 <- Exists("tuple 1")
      e2 <- Exists("tuple 2")
    } yield (e1, e2)
  }

  sealed trait Maybe[+A] {
    def map    [B](f: A =>       B):  Maybe[B]
    def flatMap[B](f: A => Maybe[B]): Maybe[B]
    def withFilter(f: A => Boolean):  Maybe[A]
  }

  final case class Exists[+A](a: A) extends Maybe[A] {
    override def map[B](f: A => B): Maybe[B] = Exists(f(a))
    override def flatMap[B](f: A => Maybe[B]): Maybe[B] = f(a)
    override def withFilter(f: A => Boolean): Maybe[A] = if f(a) then this else Lacks
  }

  case object Lacks extends Maybe[Nothing] {
    override def map    [B](f: Nothing =>       B):  Maybe[B]       = Lacks
    override def flatMap[B](f: Nothing => Maybe[B]): Maybe[B]       = Lacks
    override def withFilter(f: Nothing => Boolean):  Maybe[Nothing] = Lacks
  }

}
