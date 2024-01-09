package KTDH.SinhVienVaGiaoVien;

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
                                      sc.nextLine(), Integer.parseInt(sc.nextLine()));
                x.chuanHoa();
                listGV.add(x);
            } else {
                SinhVien x = new SinhVien(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(),
                                      sc.nextLine(), Double.parseDouble(sc.nextLine()));
                x.chuanHoa();
                listSV.add(x);
            }
        }
        System.out.println("DANH SACH GIAO VIEN :");
        for (GiaoVien x : listGV) {
            System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN :");
        for (SinhVien x : listSV) {
            System.out.println(x);
        }
    }
}