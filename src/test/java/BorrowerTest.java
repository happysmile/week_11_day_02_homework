import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book janeEyre;
    private Book lordOfTheRings;
    private Book theLittlePrince;
    private Borrower francesca;

    @Before
    public void before(){
        library = new Library(4);
        janeEyre = new Book("Jane Eyre", "Charlotte Bronte", "gothic");
        lordOfTheRings = new Book("Lord of the Rings", "J. R. R. Tolkien", "fantasy");
        theLittlePrince = new Book("The Little Prince", "Antoine de Saint-Exupéry", "children");
        library.addBook(janeEyre);
        library.addBook(lordOfTheRings);
        francesca = new Borrower("Francesca");
    }

    @Test
    public void borrowABook() {
        assertEquals(2, library.bookCount());
        assertEquals(0, francesca.getBorrowedBooks().size());
         francesca.borrowABook(janeEyre, library);
         assertEquals(1, library.bookCount());
        assertEquals(1, francesca.getBorrowedBooks().size());
        assertEquals(true, francesca.getBorrowedBooks().contains(janeEyre));
    }

    @Test
    public void borrowABookUnavailable() {
        assertEquals(2, library.bookCount());
        assertEquals(0, francesca.getBorrowedBooks().size());
        francesca.borrowABook(theLittlePrince, library);
        assertEquals(2, library.bookCount());
        assertEquals(0, francesca.getBorrowedBooks().size());

    }


}
