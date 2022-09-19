package structural

//Remote - remote server
//Virtual - caching or lazy evaluation are good examples
//Protection - access management

object BookString {
    const val book = "kjhsdfkhsdflkjsd"
}


interface IBookParser {
    fun getNumberOfPages(): Int
    fun getNumberOfChapters(): Int
}

class BookProxy() : IBookParser {

    //Delay init until you actually need the expensive obj creation
    private val bookParser : BookParser by lazy{
        BookParser(BookString.book)
    }

    override fun getNumberOfPages(): Int {
        return bookParser.getNumberOfPages()
    }

    override fun getNumberOfChapters(): Int {
        return bookParser.getNumberOfChapters()
    }
}

class BookParser(val bookString: String) : IBookParser {

    init {
        //expensive parsing!!!!
    }

    override fun getNumberOfPages(): Int {
       return bookString.length
    }

    override fun getNumberOfChapters(): Int {
        return bookString.length * 2
    }
}

