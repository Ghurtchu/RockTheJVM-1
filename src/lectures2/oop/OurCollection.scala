package lectures2.oop

object OurCollection extends App {
  val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(list.head)
  println(list.tail.head) // 2
  println(list.add(4).head)
  println(list.isEmpty)

  println(list)

}

abstract class MyList {
  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(e: Int): MyList
  def printElements: String
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList {
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(e: Int): MyList = new Cons(e, this)
  override def printElements: String = s"$head $tail"
}

class Cons(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(e: Int): MyList = new Cons(e, this)
  override def printElements: String =
    if t.tail == Empty then s"${t.head}"
    else h + " " + t.printElements
}



