package lectures.part2oop

object CounterExample {
  def main(args: Array[String]): Unit = {
    val nc: NewCounter = NewCounter(5)
    val nc5: NewCounter = nc.increment(5)

    println(nc5.n)

    val nc10 = nc5.recursiveInc(10)
    println(nc10.n)
  }
}

class NewCounter(val n: Int) {
  def increment(): NewCounter = NewCounter(n + 1)
  def decrement(): NewCounter = NewCounter(n - 1)
  def increment(n: Int): NewCounter = NewCounter(this.n + n)
  def decrement(n: Int): NewCounter = NewCounter(this.n - n)
  def recursiveInc(n: Int): NewCounter = {
    if n <= 0 then this
    else increment().increment(n - 1)
  }
}
