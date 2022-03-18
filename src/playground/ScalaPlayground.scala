//package playground
//
//object ScalaPlayground extends App {
//
//  val bookShelf: BookShelf = new BookShelf(
//    List(
//      new Book("b1", new Author("a1", 15), "comedy"),
//      new Book("b2", new Author("a2", 44), "sci-fi"),
//      new Book("b3", new Author("a3", 33), "sci-fi"),
//      new Book("b4", new Author("a4", 22), "horror"),
//      new Book("b5", new Author("a5", 24), "comedy")
//    )
//  )
//
//  val filteredBooks: List[String] = bookShelf.books
//    .filter(book => book.genre == "comedy")
//    .filter(book => book.author.age > 20)
//    .map(book => book.author.name)
//
//  println(filteredBooks)
//  2.a
//
//}
//
//sealed class Book(val name: String, val author: Author, val genre: String):
//  def getDescription: String = s"The book name = $name, author = $author, genre = $genre"
//
//sealed class Author(val name: String, val age: Int):
//  def getDescription: String = s"name = $name, age = $age"
//
//sealed class BookShelf(val books: List[Book]):
//  def getDescription: String = s"books = $books"
//
//extension(x: Int)
//  def a = println("lmao")
//
