package OOP1.LopHCN;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        String color = sc.next();
        if (a <= 0 || b <= 0) System.out.println("INVALID");
        else {
            Rectange res = new Rectange(a, b, color);
            System.out.println(res);
        }
    }
}