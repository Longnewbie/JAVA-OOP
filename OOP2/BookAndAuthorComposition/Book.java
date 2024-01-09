package OOP2.BookAndAuthorComposition;

public class Book {
    private String ten;
    private Author author;
    private double price;
    private int qty;

    public Book(String ten, Author author, double price, int qty) {
        this.ten = ten;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book Details :\n" + ten + "\n" + (int)price + "\n" + qty + "\n" + author.toString();
    }
}