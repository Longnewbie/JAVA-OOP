package OOP2.AccountClass;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            list.add(new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String user = sc.nextLine(), pass = sc.nextLine();
            if (Account.check(list, user, pass)) System.out.println("Login Successful");
            else System.out.println("Login Failed");
        }
    }
}