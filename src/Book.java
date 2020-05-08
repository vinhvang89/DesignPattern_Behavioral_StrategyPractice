public class Book {
    private String name;
    private  int price;
    public Book() {
    }

    public Book(int price,String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int code) {
        this.price = code;
    }
    public String toString(){
        return "Name : "+ name+" ,price : "+price;
    }
}
