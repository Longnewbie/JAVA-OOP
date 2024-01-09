package OOP2.CustomerAndAccount;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(int tien) {
        this.balance = this.balance + tien;
    }
    
    public void withdraw(int tien) {
        this.balance = this.balance - tien;
    }

    @Override
    public String toString() {
        return customer.toString() + "Account ID : " + id + "\n" + "Balance : " + String.format("%.2f", balance) + " $\n";
    }
}