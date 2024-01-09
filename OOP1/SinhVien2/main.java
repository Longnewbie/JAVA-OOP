package OOP1.SinhVien2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = String.format("%03d", i + 1);
            ma = "SV" + ma;
            SinhVien x = new SinhVien(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            x.chuanHoa();
            list.add(x);
        }
        for (SinhVien x : list) {
            System.out.println(x);
        }
    }
}
