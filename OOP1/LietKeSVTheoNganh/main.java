package OOP1.LietKeSVTheoNganh;

import java.util.Scanner;
import java.util.ArrayList;

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
            String nganh = sc.next();
            if (nganh.charAt(0) == 'C') System.out.println("DANH SACH SINH VIEN NGANH CONG NGHE THONG TIN :");
            else if (nganh.charAt(0) == 'D') System.out.println("DANH SACH SINH VIEN NGANH DIEN TU VIEN THONG :");
            else if (nganh.charAt(0) == 'K') System.out.println("DANH SACH SINH VIEN NGANH KE TOAN :");
            else System.out.println("DANH SACH SINH VIEN NGANH MARKETING :");
            for (SinhVien x : list) {
                if (x.getLop().charAt(0) == nganh.charAt(0)) System.out.println(x);
            }
        }
    }
}