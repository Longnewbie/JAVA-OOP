package KTDH.CircleVaCylinder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cylinder> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(new Cylinder(sc.next(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(list);
        for (Cylinder x : list) {
            System.out.println(x);
        }
    }
}