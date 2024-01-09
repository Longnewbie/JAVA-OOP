package OOP1.LopTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> list = new ArrayList<>();
        while(n-- > 0) {
            list.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list, new Comparator<Time>(){
            @Override
            public int compare(Time o1, Time o2) {
                return o1.getTime() - o2.getTime();
            }
        });
        for (Time x : list) {
            System.out.println(x);
        }
    }
}
