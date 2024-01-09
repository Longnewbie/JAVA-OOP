package OOP1.LopSinhVien1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien1 sv = new SinhVien1(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        sv.chuanHoa();
        System.out.println(sv);
    }
}