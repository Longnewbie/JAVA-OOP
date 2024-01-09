package OOP1.ThuNhapCuaGiaoVien;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien x = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println(x);
    }
}