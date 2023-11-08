public class Book extends Product{
    private String author;

    public Book() {
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    double getDiscount() {
        return getPrice()-50.0;
    }
}
