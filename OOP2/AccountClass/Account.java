package OOP2.AccountClass;

import java.util.ArrayList;

public class Account {
    private String id, customerID, user, pass;

    public Account(String id, String customerID, String user, String pass) {
        this.id = id;
        this.customerID = customerID;
        this.user = user;
        this.pass = pass;
    }
    
    public static boolean check(ArrayList<Account> list, String us, String ps) {
        for (Account x : list) {
            if (x.user.equals(us) && x.pass.equals(ps)) return true;
        }
        return false;
    }
}