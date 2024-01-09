package KTDH.TruyVanSinhVienVaGiaoVien;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiaoVien> listGV = new ArrayList<>();
        ArrayList<SinhVien> listSV = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            if (ma.substring(0, 2).equals("GV")) {
                GiaoVien x = new GiaoVien(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(),
                                      sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
                x.chuanHoa();
                listGV.add(x);
            } else {
                SinhVien x = new SinhVien(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(),
                                      sc.nextLine(), Double.parseDouble(sc.nextLine()));
                x.chuanHoa();
                listSV.add(x);
            }
        }
        String query = sc.nextLine();
        System.out.println("DANH SACH GIAO VIEN CO DIA CHI TAI " + query + " :");
        for (GiaoVien x : listGV) {
            if (x.query(query)) System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN CO DIA CHI TAI " + query + " :");
        for (SinhVien x : listSV) {
            if (x.query(query)) System.out.println(x);
        }
    }
}