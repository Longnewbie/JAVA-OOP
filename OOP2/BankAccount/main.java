package OOP2.BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            list.add(new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            sc.nextLine();
            String tmp = sc.nextLine();
            if (tmp.equals("deposit")) {
                String STK = sc.next();
                int money = sc.nextInt();
                int pos = Account.findPos(list, STK);
                list.get(pos).deposit(money);
            } else if (tmp.equals("withdraw")) {
                String STK = sc.next();
                int money = sc.nextInt();
                int pos = Account.findPos(list, STK);
                list.get(pos).withdraw(money);
            } else {
                String STK1 = sc.next(), STK2 = sc.next();
                int money = sc.nextInt();
                int pos1 = Account.findPos(list, STK1), pos2 = Account.findPos(list, STK2);
                if (list.get(pos1).getBalance() - 50000 >= money) {
                    list.get(pos1).withdraw(money);
                    list.get(pos2).deposit(money);
                }
            }
        }
        for (Account x : list) {
            System.out.println(x);
        }
    }
}