package OOP2.CustomerAndInvoice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Invoice> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String customerID[] = sc.nextLine().split("\\s+");
            String FullName[] = sc.nextLine().split("\\s+");
            String Discount[] = sc.nextLine().split("\\s+");
            String invoiceID[] = sc.nextLine().split("\\s+");
            String Amount[] = sc.nextLine().split("\\s+");
            String name = "";
            for (int j = 3; j < FullName.length; j++) {
                name += FullName[j] + " ";
            }
            name = name.trim();
            Customer x = new Customer(Integer.parseInt(customerID[customerID.length - 1]), name, Integer.parseInt(Discount[Discount.length - 1]));
            Invoice res = new Invoice(Integer.parseInt(invoiceID[invoiceID.length - 1]), x, Double.parseDouble(Amount[Amount.length - 2]));
            res.setAmount(n);
            list.add(res);
        }
        Collections.sort(list, new Comparator<Invoice>(){
            @Override
            public int compare(Invoice o1, Invoice o2) {
                if (o1.getAmount() > o2.getAmount()) return -1;
                else if (o1.getAmount() < o2.getAmount()) return 1;
                return o1.getCustomer().getId() - o2.getCustomer().getId();
            }
        });
        for (Invoice x : list) {
            System.out.println(x);
        }
    }
}