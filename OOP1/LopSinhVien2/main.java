package OOP1.LopSinhVien2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien("SV001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        sv.chuanHoa();
        System.out.println(sv);
    }
}
