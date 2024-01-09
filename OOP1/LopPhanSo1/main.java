package OOP1.LopPhanSo1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            long a = sc.nextLong(), b = sc.nextLong(),c = sc.nextLong(), d = sc.nextLong();
            PhanSo x = new PhanSo(a, b);
            PhanSo y = new PhanSo(c, d);
            PhanSo res1 = x.cong(y).nhan(x.cong(y));
            PhanSo res2 = x.nhan(y).nhan(res1);
            System.out.println(res1 + " " + res2);
        }
    }
}