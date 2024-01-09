package OOP1.TuyenSinh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HocSinh x = new HocSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(x);
    }
}