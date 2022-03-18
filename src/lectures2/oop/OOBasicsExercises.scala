package lectures2.oop

object OOBasicsExercises extends App {

  val c: Counter = new Counter(0)
  val first: Counter = c.increment
  val second: Counter = first.increment
  val third: Counter = second.decrement(2)
  val fourth: Counter = third.decrement(10)
  val fifth: Counter = fourth.increment(5)
  println(fifth.getCurrent) // -5

  val w: Writer = Writer("Anzor", "Ghurtchumelia", 1999)
  val n: Novel = Novel("book", 2005, w)

  println(w.fullName)

  println(n.authorAge)
  println(n.isWrittenBy(Writer("Anzor", "Ghurtchumelia", 1999)))
  println(n copy 2009)

}

// Novel and a Writer

// Writer: firstName, surName, year of birth
// - method => fullName =

// Novel: name, year of release, author (writer)
// - method => authorAge
// - method => isWrittenBy(author)
// - method => copy(new year of release) returns new Novel

class Writer(val firstName: String, val surName: String, val yearOfBirth: Int):
  def fullName: String = firstName concat surName

class Novel(val title: String, val yearOfRelease: Int, val author: Writer):
  def authorAge: Int = yearOfRelease - author.yearOfBirth
  def isWrittenBy(author: Writer): Boolean = this.author == author
  def copy(newYearOfRelease: Int): Novel = new Novel(this.title, newYearOfRelease, this.author)

// Counter class
// - receives an int value
// - method => returns current count
// - method => increment/decrement by one (return new counter)
// - method => overload increment/decrement by some amount (like 5 or 10) return new counter

class Counter(val count: Int):

  def getCurrent: Int = count
  def increment: Counter = new Counter(count + 1)
  def decrement: Counter = new Counter(count - 1)
  def increment(amount: Int): Counter = new Counter(count + amount)
  def decrement(amount: Int): Counter = new Counter(count - amount)