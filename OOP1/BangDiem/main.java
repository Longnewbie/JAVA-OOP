package OOP1.BangDiem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BangDiem> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ma = "HS" + String.format("%02d", i + 1);
            String ten = sc.nextLine();
            double avg = 0;
            for (int j = 1; j <= 10; j++) {
                double x = sc.nextDouble();
                avg += x;
            }
            list.add(new BangDiem(ma, ten, avg/10));
        }
        Collections.sort(list, new Comparator<BangDiem>(){
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                if (o1.getAvg() != o2.getAvg()) {
                    if (o1.getAvg() > o2.getAvg()) return -1;
                    return 1;
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (BangDiem x : list) {
            System.out.println(x);
        }
    }
}