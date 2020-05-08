import java.util.List;

public class SelectionSort implements Sort {
    @Override
    public void execute(List<Book> books) {
        for (int i = 0; i < books.size() - 1; i++) {
            Book currentBook = books.get(i);
            int currentPosition = i;
            for (int j = 0; j < books.size() ; j++) {
                if( currentBook.getPrice() > books.get(j).getPrice()){
                    currentBook = books.get(j);
                    currentPosition = j;
                }
            }
            if( currentPosition != i){
                books.set(currentPosition,books.get(i));
                books.set(i,currentBook);
            }
        }
        for(Book book:books){
            System.out.println(book.toString());
        }
    }
}
