package OOP1.LopNhanVien2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien2 sv = new NhanVien2("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                        sc.nextLine(), sc.nextLine());
        sv.chuanHoa();
        System.out.println(sv);
    }
}