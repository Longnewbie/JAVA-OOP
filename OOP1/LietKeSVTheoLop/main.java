package OOP1.LietKeSVTheoLop;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            x.chuanHoa();
            list.add(x);
        }
        int q = sc.nextInt();
        while(q-- > 0) {
            String lop = sc.next();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + " :");
            for (SinhVien x : list) {
                if (x.getLop().equals(lop)) System.out.println(x);
            }
        }
    }
}