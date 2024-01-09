package OOP1.TinhLuongNhanVien;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien x = new NhanVien("NV01", sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next());
        System.out.println(x);
    }
}