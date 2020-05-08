import java.util.List;

public class BubbleSort implements Sort {
    @Override
    public void execute(List<Book> books) {
        Book temp ;
        for (int i = 0; i < books.size() - 1  ; i++) {
            for (int j = 1 ; j < books.size() ; j++) {
                if ( books.get(i).getPrice() > books.get(j).getPrice()){
                    temp = books.get(i);
                    books.set(i,books.get(j));
                    books.set(j,temp);
                }
            }
        }
        for(Book book:books){
            System.out.println(book.toString());
        }
    }
}
