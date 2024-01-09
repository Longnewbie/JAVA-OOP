package OOP2.CustomerAndInvoice;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = this.amount - this.amount * this.customer.getDiscount()/100;
    }

    @Override
    public String toString() {
        return customer.toString() + "Amount : " + String.format("%.2f", this.amount) + " $\n" + "--------------------";
    }
}