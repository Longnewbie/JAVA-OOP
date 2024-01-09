package OOP2.BankAccount;

import java.util.ArrayList;

public class Account {
   private String id, CustomerID, number, pinCode;
   private int balance;
    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(String id, String CustomerID, String number, String pinCode, int balance) {
        this.id = id;
        this.CustomerID = CustomerID;
        this.number = number;
        this.pinCode = pinCode;
        this.balance = balance;
    }
    
    public static int findPos(ArrayList<Account> list, String STK) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).number.equals(STK)) return i;
        }
        return -1;
    }
    
    public void deposit(int money) {
        this.balance += money;
    }
    
    public void withdraw(int money) {
        if (this.balance - 50000 >= money) this.balance -= money;
    }

    @Override
    public String toString() {
        return "ID : " + id + "\n" +
               "CusID : " + CustomerID + "\n" + 
               "Number : " + number + "\n" + 
               "PIN : " + pinCode + "\n" +
               "Balance : " + balance + "VND\n" +
               "-------------------";
    }
}