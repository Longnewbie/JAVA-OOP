package OOP2.CustomerAndAccount;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String customerID[] = sc.nextLine().split("\\s+");
        String fullName[] = sc.nextLine().split("\\s+");
        String gt[] = sc.nextLine().split("\\s+");
        String accountID[] = sc.nextLine().split("\\s+");
        String balance[] = sc.nextLine().split("\\s+");
        String name = "";
        for (int i = 3; i < fullName.length; i++) name += fullName[i] + " ";
        name = name.trim();
        Customer x = new Customer(Integer.parseInt(customerID[customerID.length - 1]), name, gt[gt.length - 1]);
        Account res = new Account(Integer.parseInt(accountID[accountID.length - 1]), x, Double.parseDouble(balance[balance.length - 2]));
        sc.nextLine();
        int q = sc.nextInt(); 
        sc.nextLine();
        while(q-- > 0) {
            String []arr = sc.nextLine().split("\\s+");
            String tmp = arr[0];
            int tien = Integer.parseInt(arr[arr.length - 1]);
            if (tmp.equals("deposit")) {
                res.deposit(tien);
                System.out.println("transaction successful");
            } else {
                if (res.getBalance() >= tien) {
                    res.withdraw(tien);
                    System.out.println("transaction successful");
                } else System.out.println("amount withdrawn exceeds the current balance!");
            }
        }
        System.out.println("-------------------");
        System.out.println(res);
    }
}