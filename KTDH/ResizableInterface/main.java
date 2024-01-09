package KTDH.ResizableInterface;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ResizableCircle> list = new ArrayList<>();
        int n = sc.nextInt(); 
        for (int i = 0; i < n; i++) {
            double radius = sc.nextDouble();
            ResizableCircle x = new ResizableCircle(radius);
            int q = sc.nextInt();
            while(q-- > 0) {
                int percent = sc.nextInt();
                x.resize(percent);
            }
            list.add(x);
        }
        for (ResizableCircle x : list) {
            System.out.println(x);
        }
    }
}