package OOP1.LopPhanSo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong(), mau = sc.nextLong();
        PhanSo x = new PhanSo(tu, mau);
        System.out.println(x);
    }
}