package OOP1.SXGiangVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String ma = "GV" + String.format("%02d", i + 1);
            list.add(new GiangVien(ma, sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for (GiangVien x : list) {
            System.out.println(x);
        }
    }
}