package KTDH.PointAndMovablePoint;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        ArrayList<MovablePoint> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            MovablePoint x = new MovablePoint(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            int move = sc.nextInt();
            x.Move(move);
            list.add(x);
        }
        for (MovablePoint x : list) {
            System.out.println(x);
        }
    }
}