package lectures.part3fp

object MapFlatmapFilter extends scala.App {

  val list = List(1, 2, 3)

  // map
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  // filter
  println(list.filter(_ % 2 == 0))

  println {
    list.flatMap(List(_, 10))
  }

  // all combinations between two lists
  println {
    List(1, 2, 3).flatMap { elem1 =>
      List(4, 5, 6).map { elem2 =>
        (elem1, elem2)
      }
    }
  }

  println {
    for {
      e1 <- List(1, 2, 3)
      e2 <- List(4, 5, 6)
    } yield (e1, e2)
  }

  (1 to 100).toList.foreach(println)

  println {
    for {
      e1 <- (1 to 100).toList if e1 % 2 == 0
      e2 <- (-5 to 5).toList
    } yield (e1, e2)
  }
}
