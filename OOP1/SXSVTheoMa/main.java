package OOP1.SXSVTheoMa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        while(sc.hasNext()) {
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for (SinhVien x : list) {
            System.out.println(x);
        }
    }
}