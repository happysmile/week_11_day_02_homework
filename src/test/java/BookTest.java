import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Jane Eyre", "Emily Bronte", "gothic");
    }

    @Test
    public void hasTitle(){
        assertEquals("Jane Eyre", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Emily Bronte", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("gothic", book.getGenre());
    }
}
