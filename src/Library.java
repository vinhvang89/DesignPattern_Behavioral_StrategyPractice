import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;
    public Library(){
        books = new ArrayList<>();
    }
    public void create(int price,String name){
        books.add(new Book(price,name));
    }
    public void sort(Sort method ){
       method.execute(books);
    }
    public void display(){
        for(Book book:books){
            System.out.println(book.toString());
        }
    }
}
