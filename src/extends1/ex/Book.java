package extends1.ex;

public class Book extends Item{
    String name;
    int price;
    String author;
    String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name,price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 작가 : "+author+" isbn : "+ isbn);
    }
}
