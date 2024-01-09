package OOP2.BookAndAuthorComposition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Book> list = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String tenSach = sc.nextLine();
            double gia = Double.parseDouble(sc.nextLine());
            int soLuong = Integer.parseInt(sc.nextLine());
            Author x = new Author(sc.nextLine(), sc.nextLine(), sc.nextLine().charAt(0));
            list.add(new Book(tenSach, x, gia, soLuong));
        }
        Collections.sort(list, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()) return -1;
                else if (o1.getPrice() < o2.getPrice()) return 1;
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        for (Book x : list) {
            System.out.println(x);
        }
    }
}