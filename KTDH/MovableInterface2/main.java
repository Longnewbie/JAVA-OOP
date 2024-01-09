package KTDH.MovableInterface2;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MovableCircle> list = new ArrayList<>();
        int n = sc.nextInt(); 
        for (int i = 0; i < n; i++) {
            MovableCircle x = new MovableCircle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            int q = sc.nextInt();
            while(q-- > 0) {
                String tmp = sc.next();
                if (tmp.equals("Down")) x.moveDown();
                else if (tmp.equals("Up")) x.moveUp();
                else if (tmp.equals("Left")) x.moveLeft();
                else x.moveRight();
            }
            list.add(x);
        }
        for (MovableCircle x : list) {
            System.out.println(x);
        }
    }
}