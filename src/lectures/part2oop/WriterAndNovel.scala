package lectures.part2oop

object WriterAndNovel extends App {

  val author: Writer = new Writer("Charles", "Dickens", 1812)
  val imposter: Writer = new Writer("Charles", "Dickens", 1812)


  val novel: Novel = new Novel("Great Expectations", 1862, author)

  println(novel.authorAge())
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))
}

private class Writer(val firstName: String = "", val surName: String = "", val year: Int = 0) {
  def fullName(): String = s"$firstName $surName"
}

private class Novel(val name: String, val yearOfRelease: Int, val writer: Writer) {
  def authorAge(): Int = yearOfRelease - writer.year
  def isWrittenBy(writer: Writer): Boolean = writer == this.writer
  def copy(yearOfRelease: Int): Novel = Novel(this.name, yearOfRelease, this.writer)
}


