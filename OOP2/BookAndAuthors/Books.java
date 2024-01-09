package OOP2.BookAndAuthors;

public class Books {
    private String name;
    private Authors[] authors;
    private double price;
    private int qty, soTG;

    public Books(String name, Authors[] authors, double price, int qty, int soTG) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
        this.soTG = soTG;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getSoTG() {
        return soTG;
    }

    public void setSoTG(int soTG) {
        this.soTG = soTG;
    }
    
    public void show(int n) {
        System.out.println("-----------------------");
        System.out.println("Book information :");
        System.out.println("Name : " + name);
        System.out.println("Price : " + Math.round(price));
        System.out.println("Quantity : " + qty);
        System.out.println("Author information :");
        for (int i = 0; i < n; i++) {
            System.out.println("#" + (i + 1));
            System.out.println(authors[i]);
        }
    }
}