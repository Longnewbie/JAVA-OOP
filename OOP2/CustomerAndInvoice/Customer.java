package OOP2.CustomerAndInvoice;

public class Customer {
    private int id;
    private String name;
    private int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    @Override
    public String toString() {
        return "Customer ID : " + id + "\n" + 
               "Full Name : " + name + "\n";
    }
}