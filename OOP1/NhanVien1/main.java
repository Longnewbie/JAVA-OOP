package OOP1.NhanVien1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = String.format("%05d", i + 1);
            NhanVien x = new NhanVien(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            x.chuanHoaDMY();
            list.add(x);
        }
        for (NhanVien x : list) {
            System.out.println(x);
        } 
    }
}