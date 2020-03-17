import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book janeEyre;
    private Book lordOfTheRings;
    private Book harryPotter;
    private Book annaKarenina;
    private Book theLittlePrince;

    @Before
    public void before(){
        library = new Library(4);
        janeEyre = new Book("Jane Eyre", "Charlotte Bronte", "gothic");
        lordOfTheRings = new Book("Lord of the Rings", "J. R. R. Tolkien", "fantasy");
        annaKarenina = new Book("Anna Karenina", "Leo Tolstoy", "realism");
        harryPotter = new Book("Harry Potter", "J K Rowling", "fantasy");
        theLittlePrince = new Book("The Little Prince", "Antoine de Saint-Exupéry", "children");
        library.addBook(janeEyre);
    }

    @Test
    public void canAddBook(){
        assertEquals(1, library.bookCount());
        library.addBook(lordOfTheRings);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        assertEquals(1, library.bookCount());
        library.removeBook(janeEyre);
        assertEquals(0, library.bookCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, library.getCapacity());
    }

    @Test
    public void canAddBookIfEnoughCapacity(){
        assertEquals(1, library.bookCount());
        library.addBook(lordOfTheRings);
        library.addBook(annaKarenina);
        library.addBook(harryPotter);
        assertEquals(4, library.bookCount());
        library.addBook(theLittlePrince);
        assertEquals(4, library.bookCount());
    }





}
