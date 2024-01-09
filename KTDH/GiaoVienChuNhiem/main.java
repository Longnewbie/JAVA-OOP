package KTDH.GiaoVienChuNhiem;

import java.util.*;

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
                                Integer.parseInt(sc.nextLine()), sc.nextLine());
                x.chuanHoa();
                gv.add(x);
            } else {
                sinhVien x = new sinhVien(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                                Double.parseDouble(sc.nextLine()));
                x.chuanHoa();
                sv.add(x);
            }
        }
        String tmp = sc.nextLine();
        System.out.println("DANH SACH GIAO VIEN PHU TRACH LOP " + tmp + " :");
        for (giaoVien x : gv) {
            if (x.getChuNhiem().equals(tmp)) System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN LOP " + tmp + " :");
        for (sinhVien x : sv) {
            if (x.getLop().equals(tmp)) System.out.println(x);
        }
    }
}