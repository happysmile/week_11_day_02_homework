import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public void addBook(Book book){
        if(this.bookCount()<this.getCapacity()){
            this.books.add(book);
        }
    }

    public int bookCount(){
        return this.books.size();
    }

    public void removeBook(Book book){
        this.books.remove(this.books.indexOf(book));
    }

    public int getCapacity(){
        return this.capacity;
    }

}

