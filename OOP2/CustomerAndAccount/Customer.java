package OOP2.CustomerAndAccount;

public class Customer {
    private int id;
    private String name, gt;

    public Customer(int id, String name, String gt) {
        this.id = id;
        this.name = name;
        this.gt = gt;
    }

    @Override
    public String toString() {
        return "Customer ID : " + id + "\n" + 
                "Full Name : " + name + "\n" +
                "Gender : " + gt + "\n"; 
    }
}