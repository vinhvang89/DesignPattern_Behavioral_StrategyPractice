import java.util.List;

public class InsertionSort implements Sort {
    @Override
    public void execute(List<Book> books) {
        Book insertBook;
        int insertBookIndex;
        for (int i = 1; i < books.size() ; i++) {
            insertBook = books.get(i);
            insertBookIndex = i;
            while ( insertBookIndex > 0 && books.get(i-1).getPrice() > insertBook.getPrice()){
                books.set(insertBookIndex,books.get(insertBookIndex -1));
                insertBookIndex--;
            }
            if( insertBookIndex != i){
                books.set(insertBookIndex,insertBook);
            }
        }
        for(Book book:books){
            System.out.println(book.toString());
        }
    }
}
