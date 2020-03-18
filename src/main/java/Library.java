import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> genresCount;

    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
        this.genresCount = new HashMap<String, Integer>();
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

    public ArrayList getBooks(){
        return this.books;
    }

    public HashMap getGenresCount() {
        this.setGenresCount();
        return this.genresCount;
    }

    private void setGenresCount(){
        if(this.books.size() > 0){
            int counter;
            String genre;
            for(Book book : this.books){
               if(this.genresCount.containsKey(book.getGenre())) {
                   genre = book.getGenre();
                   counter = this.genresCount.get(genre) + 1;
               } else {
                   counter = 1;
               }
                this.genresCount.put(book.getGenre(), counter);
            }
        }
    }


}

