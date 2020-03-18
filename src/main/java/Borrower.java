import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public void borrowABook(Book book, Library library) {
        if (library.getBooks().contains(book)) {
            this.borrowedBooks.add(book);
            library.removeBook(book);
        }
    }

    public ArrayList getBorrowedBooks(){
        return this.borrowedBooks;
    }


}
