package OOP1.TInhGioQuanNet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TimeLine> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            list.add(new TimeLine(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list, new Comparator<TimeLine>(){
            @Override
            public int compare(TimeLine o1, TimeLine o2) {
                int h1 = o1.getSumTime() / 60, m1 = o1.getSumTime() % 60;
                 int h2 = o2.getSumTime() / 60, m2 = o2.getSumTime() % 60;
                 if (h1 != h2) return h2 - h1;
                 else if (m1 != m2) return m2 - m1;
                 return o1.getUser().compareTo(o2.getUser());
            }
        });
        for (TimeLine x : list) {
            System.out.println(x);
        }
    }
}