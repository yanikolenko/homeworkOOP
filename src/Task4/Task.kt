package Task4

fun main() {
    val reader = Reader("Yarik", 6389, "Ifotech", "04.02.2002", 4444 )

    reader.takeBook()
    reader.takeBook("Book1")
    reader.takeBook("Book2")
    reader.takeBook("Book3")
    reader.takeBook()
    reader.returnBook("Book1")
    reader.returnBook()

}