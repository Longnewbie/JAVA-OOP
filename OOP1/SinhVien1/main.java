package OOP1.SinhVien1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ma = String.format("%03d", i + 1);
            ma = "SV" + ma;
            SinhVien x = new SinhVien(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            x.chuanHoaNS();
            list.add(x);
        }
        for (SinhVien x : list) {
            System.out.println(x);
        }
    }
}