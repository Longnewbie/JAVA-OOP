package KTDH.MovableInterface;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MovablePoint> list = new ArrayList<>();
        int n = sc.nextInt(); 
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), xSpeed = sc.nextInt(), ySpeed = sc.nextInt();
            MovablePoint res = new MovablePoint(x, y, xSpeed, ySpeed);
            int q = sc.nextInt();
            while(q-- > 0) {
                String tmp = sc.next();
                if (tmp.equals("Down")) res.moveDown();
                else if (tmp.equals("Up")) res.moveUp();
                else if (tmp.equals("Left")) res.moveLeft();
                else res.moveRight();
            }
            list.add(res);
        }
        for (MovablePoint x : list) {
            System.out.println(x);
        }
    }
}