package OOP1.DanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ma = String.format("%04d", i + 1);
            ma = "MH" + ma;
            list.add(new Item(ma, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list, new Comparator<Item>(){
            @Override
            public int compare(Item o1, Item o2) {
                if (o1.getLoiNhuan() != o2.getLoiNhuan()) return o2.getLoiNhuan() - o1.getLoiNhuan();
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (Item x : list) {
            System.out.println(x);
        }
    }
}