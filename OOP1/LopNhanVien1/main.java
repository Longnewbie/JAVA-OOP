package OOP1.LopNhanVien1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien1 nv = new NhanVien1("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        nv.chuanHoa();
        System.out.println(nv);
    }
}