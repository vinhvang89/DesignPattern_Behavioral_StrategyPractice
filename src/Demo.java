public class Demo {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        BubbleSort bubbleSort = new BubbleSort();
        Library library = new Library();
        library.create(12,"A");
        library.create(2,"B");
        library.create(19,"C");
        library.create(52,"D");
        library.create(1,"E");
        library.create(99,"F");
        library.create(32,"G");
        library.sort(bubbleSort);
    }
}
