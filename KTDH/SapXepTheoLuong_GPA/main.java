package KTDH.SapXepTheoLuong_GPA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhVien> sv = new ArrayList<>();
        ArrayList<giaoVien> gv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            if (ma.substring(0, 2).equals("GV")) {
                giaoVien x = new giaoVien(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                        Integer.parseInt(sc.nextLine()));
                x.chuanHoa();
                gv.add(x);
            } else {
                sinhVien x = new sinhVien(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                        Double.parseDouble(sc.nextLine()));
                x.chuanHoa();
                sv.add(x);
            }
        }
        Collections.sort(gv);
        Collections.sort(sv);
        System.out.println("DANH SACH GIAO VIEN :");
        for (giaoVien x : gv) System.out.println(x);
        System.out.println("DANH SACH SINH VIEN :");
        for (sinhVien x : sv) System.out.println(x);
    }
}