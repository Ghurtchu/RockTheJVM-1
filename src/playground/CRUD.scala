package playground

object CRUD extends App {

  val bookshelfDao: BookshelfDao = new BookshelfDaoImpl
  val bookshelf: Bookshelf = bookshelfDao.getElementById(5)
  println(bookshelf)

  val added: Boolean = bookshelfDao.addElement(Bookshelf(124, List(Book(12345, "t123", new Author("awiawj", 444)))))
  println(added)


}

private sealed case class Bookshelf(id: Int = 0, books: List[Book] = List())
private sealed case class Book(id: Int, title: String, author: Author)
private sealed case class Author(name: String, age: Int)

private sealed trait BookshelfDao:
  def getElementById(id: Int): Bookshelf
  def addElement(bookshelf: Bookshelf): Boolean

private sealed class BookshelfDaoImpl extends BookshelfDao:

  private var data: List[Bookshelf] = List(
    Bookshelf(1, List(
      Book(1, "t1", Author("a1", 15)),
      Book(2020, "t1", Author("a2", 16)),
      Book(3, "t1", Author("a3", 22)))),
    Bookshelf(2, List(
      Book(4, "t1", Author("b3", 223)))),
    Bookshelf(3, List(
      Book(5, "t1", Author("b1", 152)),
      Book(10, "t1", Author("a2", 164)),
      Book(22, "t1", Author("c3", 221)),
      Book(30, "t1", Author("c2", 224)))))

  override def getElementById(id: Int): Bookshelf = {
    val exists: Boolean = data.exists(bs => bs.id == id)
    if exists then data.find(bs => bs.id == id).get else Bookshelf()
  }

  override def addElement(bookshelf: Bookshelf): Boolean =
    data = bookshelf :: data
    data.contains(bookshelf)