package OOP1.NhanVien2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ma = String.format("%05d", i + 1);
            NhanVien x = new NhanVien(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            x.chuanHoaDMY();
            list.add(x);
        }
        Collections.sort(list, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                String t1 = o1.DOB(o1.getNgSinh()), t2 = o2.DOB(o2.getNgSinh());
                return t1.compareTo(t2);
            }
        });
        for (NhanVien x : list) {
            System.out.println(x);
        } 
    }
}