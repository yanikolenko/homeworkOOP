package Task4

class Reader(var fullName:String, number:Int, facultet:String, birth:String, telephone:Int) {

    var numberOfBook = mutableListOf<String>()
    var returnedBooks:Int = 0

    fun takeBook(){
        println("$fullName взяв ${numberOfBook.size} книг")
    }

    fun takeBook(books:String){
        numberOfBook.add(books.toString())
        println("$fullName взяв книги: ${numberOfBook.joinToString()}")
    }

    fun returnBook(){
        println("$fullName повернув $returnedBooks книг")
    }

    fun returnBook(nameOfBook:String){
        if (nameOfBook in numberOfBook){
            numberOfBook.remove(nameOfBook)
            println("$fullName повернув $nameOfBook книгу")
            returnedBooks++
        }else{
            println("Такої книги немає, поверни де взяв!")
        }
    }


}