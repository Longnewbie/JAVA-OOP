package OOP2.BookAndAuthors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Books> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String tenSach = sc.nextLine();
            double gia = sc.nextDouble();
            int soLuong = sc.nextInt();
            int luongTG = sc.nextInt();
            sc.nextLine();
            Authors author[] = new Authors[luongTG];
            for (int j = 0; j < luongTG; j++) {
                String tenTG = sc.nextLine();
                String email = sc.nextLine();
                char gt = sc.nextLine().charAt(0);
                Authors x = new Authors(tenTG, email, gt);
                author[j] = x;
            }
            list.add(new Books(tenSach, author, gia, soLuong, luongTG));
        }
        Collections.sort(list, new Comparator<Books>(){
            @Override
            public int compare(Books o1, Books o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Books x : list) {
            x.show(x.getSoTG());
        }
    }
}